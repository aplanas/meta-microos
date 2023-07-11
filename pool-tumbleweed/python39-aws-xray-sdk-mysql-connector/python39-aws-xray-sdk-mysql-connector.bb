SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-mysql-connector-2.12.0-2.3.noarch.rpm"
RPM_HASH = "f4966550e143016cda10675bfa78b8a22f027438c3e9bf1dc746faebe8856787cf94dfd11f0a77731d434e3ac8ca13667a40a9b1479ea7e7d585dc054f3fb3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-mysql-connector"

RDEPENDS:${PN} += "python-abi \
python39-aws-xray-sdk \
python39-mysql-connector-python"

inherit rpm
