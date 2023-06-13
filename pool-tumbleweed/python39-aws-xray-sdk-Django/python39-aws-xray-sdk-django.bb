SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-Django-2.12.0-1.1.noarch.rpm"
RPM_HASH = "8f0545d8d9e2c238d98b8795285f400244bbe3767282ac6f83b04b9e58fa4d65cca97d624af56742e99d7a43c36194eb668afd866fc4e339268d7675c7494e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-Django"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-aws-xray-sdk"

inherit rpm
