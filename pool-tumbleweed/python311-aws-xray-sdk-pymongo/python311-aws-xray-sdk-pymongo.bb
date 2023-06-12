SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-pymongo-2.12.0-1.1.noarch.rpm"
RPM_HASH = "dd0d943ab2f5d4e6552e1618c50d33be8d58b7f069cba0ddea18deb827ea136b417d13ac09678b7f9e3e49a94b79559bfc685c6f63a1918a100d861c02d7c5b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-pymongo"
RDEPENDS:${PN} += "python(abi) \
python311-aws-xray-sdk \
python311-pymongo"

inherit rpm
