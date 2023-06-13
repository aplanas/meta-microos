SUMMARY = "Python Interface to DynamoDB"
DESCRIPTION = "A Python interface for Amazon's DynamoDB."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python39-pynamodb-5.3.4-1.2.noarch.rpm"
RPM_HASH = "b74bd04b2e15ba8faf5717d9bd7bc379d8371e54e3795492f42a9b1c8e36ab0e75a5efa6e203475fe2091c4ab2fb019805604e7f379bd276843e38ed4450e159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pynamodb) \
python39-pynamodb \
python3dist(pynamodb)"

RDEPENDS:${PN} += "python(abi) \
python39-botocore \
python39-python-dateutil"

inherit rpm
