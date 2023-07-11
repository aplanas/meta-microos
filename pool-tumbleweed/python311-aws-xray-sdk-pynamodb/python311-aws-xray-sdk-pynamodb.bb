SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-pynamodb-2.12.0-2.3.noarch.rpm"
RPM_HASH = "215e1fdd305b8298c332520b9ca336595fd7c442a0fcab00d9b531c4ba30f82e5c4fd1923cdaa48bf315d3bbea6d6f53068fdf1540b8357f69ef0747486b01c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pynamodb \
python311-aws-xray-sdk-pynamodb"

RDEPENDS:${PN} += "python-abi \
python311-aws-xray-sdk \
python311-pynamodb"

inherit rpm
