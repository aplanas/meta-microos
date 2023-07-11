SUMMARY = "Python Interface to DynamoDB"
DESCRIPTION = "A Python interface for Amazon's DynamoDB."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python311-pynamodb-5.3.4-1.4.noarch.rpm"
RPM_HASH = "5082b097ecad4daafd474533c261200814b3f8c5a7eb1c671cb87536ec7193936529ff1de724732ccb951dafdc9f1c6a4d5110db6f11de48a00fd1eb92b0d749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynamodb \
python3.11dist-pynamodb \
python311-pynamodb \
python3dist-pynamodb"

RDEPENDS:${PN} += "python-abi \
python311-botocore \
python311-python-dateutil"

inherit rpm
