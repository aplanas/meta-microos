SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-pynamodb-2.12.0-1.1.noarch.rpm"
RPM_HASH = "4ac349df99bf0a9b05482f54db06ef4a3a0f25caa5442a1b70c13d09eb113a4a08dddfe2b700627f854d083f62336fdff52f0c624604b0005015b5c931b9d3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pynamodb \
python310-aws-xray-sdk-pynamodb"

RDEPENDS:${PN} += "python-abi \
python310-aws-xray-sdk \
python310-pynamodb"

inherit rpm
