SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-mysql-connector-2.12.0-2.3.noarch.rpm"
RPM_HASH = "488c7687ec3d646ca1565e62ede94d1875e6f99e545bba51c116ddfac2614d831f9db842db107f3cbcaf66ca26805a74947a2f98a20181a79760cb2a724adb84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-mysql-connector \
python311-aws-xray-sdk-mysql-connector"

RDEPENDS:${PN} += "python-abi \
python311-aws-xray-sdk \
python311-mysql-connector-python"

inherit rpm
