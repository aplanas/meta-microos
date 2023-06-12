SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-Django-2.12.0-1.1.noarch.rpm"
RPM_HASH = "76051412175ef704d69e80290dc1219986850525e39d8ed41f75968064032672c9ee646d14cd12e20f8b780bf080a852e70270c8fac80d773f7e59cdf9b1ece2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-Django"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-aws-xray-sdk"

inherit rpm
