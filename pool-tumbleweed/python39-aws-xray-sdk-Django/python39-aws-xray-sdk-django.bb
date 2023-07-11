SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-Django-2.12.0-2.3.noarch.rpm"
RPM_HASH = "d70b74830c3eebe17997a8cad233786b06eef3ca92452eb25368a4d57579e1d813c2f1d5f1291c5a338df8c2fafe83f857d1383eb8e331e67957dddc85262d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-Django"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-aws-xray-sdk"

inherit rpm
