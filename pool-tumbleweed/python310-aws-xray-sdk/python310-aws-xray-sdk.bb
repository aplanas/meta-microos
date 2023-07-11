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
Additional backends can be installed by installing python310-aws-xray-sdk-backend \
packages.  The python310-aws-xray-sdk-all package installs all backends."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-2.12.0-2.3.noarch.rpm"
RPM_HASH = "77e9a5725f18ecb1f14748ada4bf82a9881a71709985b0fed7273e2d6683770ac02673da9ff566a60f242705b24017a6618c6019f9acbf48004a0b4192967080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aws-xray-sdk \
python310-aws-xray-sdk \
python3dist-aws-xray-sdk"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-wrapt"

inherit rpm
