SUMMARY = "Microsoft Azure Education Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Education Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-mgmt-education-1.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "93cf7fd18821599d15b7bea1f846235a0c4605168596d88d693e3027dc7c434070685b02c19daccbb51bc84efaf7977a72068a74fea2bc290c32ce1764517c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-education \
python310-azure-mgmt-education \
python3dist-azure-mgmt-education"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
