SUMMARY = "Python Interface to DynamoDB"
DESCRIPTION = "A Python interface for Amazon's DynamoDB."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python39-pynamodb-5.3.4-1.4.noarch.rpm"
RPM_HASH = "74b82a94da05efb255c1432dafd6147d7e7fd072d0065741b2fc0b09926e9c484f028b29bc6e74de9c66eca99276f074cbd58412c7ed381802d22729b6dd6f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynamodb \
python39-pynamodb \
python3dist-pynamodb"

RDEPENDS:${PN} += "python-abi \
python39-botocore \
python39-python-dateutil"

inherit rpm
