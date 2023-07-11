SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python310-quantities-0.14.1-1.3.noarch.rpm"
RPM_HASH = "fd1609994f03f60c4ae07d7f36aaa63c7e6819dd337f2bf40b5b788b751aa249610efdd373a1d9bb429ddecd049b940b89a0647e3d80e9f046c6a1c12101f6e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-quantities \
python310-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
