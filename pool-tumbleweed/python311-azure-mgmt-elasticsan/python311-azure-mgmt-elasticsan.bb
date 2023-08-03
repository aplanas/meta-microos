SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-elasticsan-1.0.0b2-1.1.noarch.rpm"
RPM_HASH = "c4cb28e894517c7c4b12fad92ae0377b19371bfa21fbfccb725863e84cee0b1e9a384bb983869d492633f7392b97acfed12fee4f393e0eb0c3dbd7152c7f3708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-elasticsan \
python3.11dist-azure-mgmt-elasticsan \
python311-azure-mgmt-elasticsan \
python3dist-azure-mgmt-elasticsan"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
