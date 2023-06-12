SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-mysql-connector-2.12.0-1.1.noarch.rpm"
RPM_HASH = "7f03a8f11e83f25c7710e9d2b2c7d4666a26ba95499689afc4ced8ba940e3453c456dd68d3dcd6cce639c1ca65ec9239a3539758ffb85767edbd176ac50e65f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-mysql-connector \
python310-aws-xray-sdk-mysql-connector"
RDEPENDS:${PN} += "python(abi) \
python310-aws-xray-sdk \
python310-mysql-connector-python"

inherit rpm
