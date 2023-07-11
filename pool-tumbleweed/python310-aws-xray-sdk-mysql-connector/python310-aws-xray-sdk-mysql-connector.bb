SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-mysql-connector-2.12.0-2.3.noarch.rpm"
RPM_HASH = "1e22a19d52262db87d04537324abb83584d9666b0f580ad8a055c3303d75a8bd3de758907ccf336baccd659bd4435de55e1125f9cb28075034fbffc452890ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-mysql-connector"

RDEPENDS:${PN} += "python-abi \
python310-aws-xray-sdk \
python310-mysql-connector-python"

inherit rpm
