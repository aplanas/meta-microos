SUMMARY = "Flaks backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-Flask-2.12.0-2.3.noarch.rpm"
RPM_HASH = "31a0a53353530f3aa796cf3eeab800a05239a1899e5875d604d01625ae4ca9411e379cbcf3c8ceca3582dcf48b4b265e29090f317c0f4d196964111a6a8bd967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-Flask \
python311-aws-xray-sdk-Flask"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-aws-xray-sdk"

inherit rpm
