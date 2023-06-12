SUMMARY = "Flaks backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-Flask-2.12.0-1.1.noarch.rpm"
RPM_HASH = "8e05991ed9040d92a33023d18caeab528c424cc8a04b9b03401d95bb41d72175b43bdb0f69d0f185b5c904ed48f4220ea70f827b733c66025683c1407a3eac55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-Flask"
RDEPENDS:${PN} += "python(abi) \
python39-Flask \
python39-aws-xray-sdk"

inherit rpm
