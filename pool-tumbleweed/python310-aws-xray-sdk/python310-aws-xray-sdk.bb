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

RPM_NAME = "python310-aws-xray-sdk-2.12.0-1.1.noarch.rpm"
RPM_HASH = "8298b58f784c5f096ad21dd97419b0c20c8d998a19e8463339f38860d4b447de808528acfdd7a0d7062857aabc79d534d5b618235e41b90e9c1eab4dcd2d2136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk \
python3.10dist-aws-xray-sdk \
python310-aws-xray-sdk \
python3dist-aws-xray-sdk"

RDEPENDS:${PN} += "python-abi \
python310-botocore \
python310-wrapt"

inherit rpm
