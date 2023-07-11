SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-Django-2.12.0-2.3.noarch.rpm"
RPM_HASH = "f7d8ed9a6fc9cc575f0b916165f60fd68228f0841d403ca0a71fbc01f7e2a7d8d9c43ed060130380e401ad8863431dfde600b1d3ba3490b5f5d1b5b0d08a6f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-Django"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-aws-xray-sdk"

inherit rpm
