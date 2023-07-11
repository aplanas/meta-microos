SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-Django-2.12.0-2.3.noarch.rpm"
RPM_HASH = "585f916663eded12ccfd810c520280f6fb1c0cb7ce08d276fd76bffee94056b8282f2ad1162b68832ae0e62727cfb5ac9e302dad3d487785627dec2cb31674c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-Django \
python311-aws-xray-sdk-Django"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-aws-xray-sdk"

inherit rpm
