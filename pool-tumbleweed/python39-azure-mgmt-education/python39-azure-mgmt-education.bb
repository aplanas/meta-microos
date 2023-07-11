SUMMARY = "Microsoft Azure Education Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Education Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-mgmt-education-1.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "81cca2f287027ea94d4dabbbdf233f0f3c172c6d8c4a985b484a0112419ec09d81cc6544c71760918b45462304941d054b2c3c6d5e8f06e9e762849625675926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-education \
python39-azure-mgmt-education \
python3dist-azure-mgmt-education"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
