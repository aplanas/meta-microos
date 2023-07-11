SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-pymongo-2.12.0-2.3.noarch.rpm"
RPM_HASH = "fbd5ccfbf72c009fbc6b5726dc6452462870590e0e9dcee6716f8c796442a0ef712f704b72356e01d12da67995af21762d5969f30e277e65ac433e78618d60db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-pymongo"

RDEPENDS:${PN} += "python-abi \
python39-aws-xray-sdk \
python39-pymongo"

inherit rpm
