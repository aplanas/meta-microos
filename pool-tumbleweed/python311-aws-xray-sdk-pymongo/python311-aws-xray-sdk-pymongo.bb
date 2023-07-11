SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-pymongo-2.12.0-2.3.noarch.rpm"
RPM_HASH = "0c83e971f999c639e357d8054c666dd9413d98947339fe38b47f0c5c6e93d5a20a8f0d90630a6d226e7e7b5db356376cae77007b7dee2ae161a4c93d4182d33e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pymongo \
python311-aws-xray-sdk-pymongo"

RDEPENDS:${PN} += "python-abi \
python311-aws-xray-sdk \
python311-pymongo"

inherit rpm
