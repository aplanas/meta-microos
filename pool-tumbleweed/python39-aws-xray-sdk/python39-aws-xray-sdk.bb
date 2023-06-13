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
Additional backends can be installed by installing python39-aws-xray-sdk-backend \
packages.  The python39-aws-xray-sdk-all package installs all backends."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-2.12.0-1.1.noarch.rpm"
RPM_HASH = "e35480553952e6e9e9b902b3b0aa3d33e947715a941ef11442a2425a64be767f282b23590692bb769db205302935fbb5d746cd251f419cad72a0c96c10369de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aws-xray-sdk) \
python39-aws-xray-sdk \
python3dist(aws-xray-sdk)"

RDEPENDS:${PN} += "python(abi) \
python39-botocore \
python39-wrapt"

inherit rpm
