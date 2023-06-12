SUMMARY = "Flaks backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-Flask-2.12.0-1.1.noarch.rpm"
RPM_HASH = "b6573a78df1b120d6821d4846fabfd503a8e81aec3bd7ee1b423c0dd1a01016df87b6b9b06a81a65b819bdf9f051b6fe2008c3ed13080b5217552e92b0f4d1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-Flask \
python310-aws-xray-sdk-Flask"
RDEPENDS:${PN} += "python(abi) \
python310-Flask \
python310-aws-xray-sdk"

inherit rpm
