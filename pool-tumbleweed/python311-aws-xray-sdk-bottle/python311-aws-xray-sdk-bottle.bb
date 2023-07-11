SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-bottle-2.12.0-2.3.noarch.rpm"
RPM_HASH = "a15033f2a18557e53cfccc6728ed0bae3d4a9641a60e8de7196a1876a61b4a644cc4982e28f0aa22acb59d871d60403beafecda0214cfd28ed044b2049b67df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-bottle \
python311-aws-xray-sdk-bottle"

RDEPENDS:${PN} += "python-abi \
python311-aws-xray-sdk \
python311-bottle"

inherit rpm
