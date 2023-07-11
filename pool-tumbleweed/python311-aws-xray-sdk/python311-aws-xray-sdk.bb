SUMMARY = "The AWS X-Ray SDK for Python"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
It works through any one of various frameworks, provided by backends. The \
following backends are included in the main package: \
 \
  * botocore \
  * httplib \
  * sqlite3 \
 \
Additional backends can be installed by installing python311-aws-xray-sdk-backend \
packages.  The python311-aws-xray-sdk-all package installs all backends."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-2.12.0-2.3.noarch.rpm"
RPM_HASH = "9feeadffefac5460143cf527c013557983bf5f13859f6de1d72a86217ccf29197e40019670503f37234f56e1d89aa7fe084231c1afe626506261554f3fa1b529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk \
python3.11dist-aws-xray-sdk \
python311-aws-xray-sdk \
python3dist-aws-xray-sdk"

RDEPENDS:${PN} += "python-abi \
python311-botocore \
python311-wrapt"

inherit rpm
