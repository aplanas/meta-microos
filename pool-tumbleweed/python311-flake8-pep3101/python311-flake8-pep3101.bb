SUMMARY = "Checks for old string formatting"
DESCRIPTION = "Checks for old string formatting."
LICENSE = "GPL-2.0-only"

PV = "2.0.0"

RPM_NAME = "python311-flake8-pep3101-2.0.0-1.4.noarch.rpm"
RPM_HASH = "dccf7c1774ccfb27e4fd3ba2d4cc05b0f5839382327a139bb950376b38ff44f15f82e252f06d2b04d1cf90eef823ce1d625faadf7cbbace9757c8abac64734de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-pep3101) \
python311-flake8-pep3101 \
python3dist(flake8-pep3101)"
RDEPENDS:${PN} += "python(abi) \
python311-flake8"

inherit rpm
