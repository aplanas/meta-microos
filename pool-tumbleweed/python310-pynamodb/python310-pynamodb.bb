SUMMARY = "Python Interface to DynamoDB"
DESCRIPTION = "A Python interface for Amazon's DynamoDB."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python310-pynamodb-5.3.4-1.2.noarch.rpm"
RPM_HASH = "435b85717962307b5e0d519d69e93ef1a62909d9258ff2658e621d5fee66bd4fe9d0c9f3d78683be8b815946ef8cab38ee52dde4aed3e37586fc5a2f64bfa75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynamodb \
python3.10dist-pynamodb \
python310-pynamodb \
python3dist-pynamodb"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-python-dateutil"

inherit rpm
