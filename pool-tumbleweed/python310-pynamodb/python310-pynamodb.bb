SUMMARY = "Python Interface to DynamoDB"
DESCRIPTION = "A Python interface for Amazon's DynamoDB."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python310-pynamodb-5.3.4-1.4.noarch.rpm"
RPM_HASH = "e72894b01f722462009374283d4709693f277619995e9432c0615a132b18b35b6aa583cb530562f0607fb92a40ba6c59647a978c8408ea84c633dbc88d71ab07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pynamodb \
python310-pynamodb \
python3dist-pynamodb"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-python-dateutil"

inherit rpm
