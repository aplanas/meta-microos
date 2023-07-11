SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-baremetalinfrastructure-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "df00936d0a9b0b871203b93a6b640b3db99e29effb1545265c7c4fa6e27b19f5af530b62e1225e51452a6646e45c3c1b79c8b9200e530f16bfc0d3903d6ea5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-baremetalinfrastructure \
python39-azure-mgmt-baremetalinfrastructure \
python3dist-azure-mgmt-baremetalinfrastructure"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
