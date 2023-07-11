SUMMARY = "Flaks backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-Flask-2.12.0-2.3.noarch.rpm"
RPM_HASH = "cf8be2f0a3c90d341368281df2f372adbb32fbcf0f14067b2b2427e85e5c6b4a143d779c54d18c49473bd1bcd7b38d7b6894c831eaa73555a1a175f747beba0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-Flask"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-aws-xray-sdk"

inherit rpm
