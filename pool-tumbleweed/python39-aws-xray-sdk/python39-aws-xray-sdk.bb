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

RPM_NAME = "python39-aws-xray-sdk-2.12.0-2.3.noarch.rpm"
RPM_HASH = "8a0764c9f7663d05f50ee2ed178878f2fb65e5ee0b115ae69eb244302f730f1e183b33b68fd11b0b9c1df6fdb2fddfed5976af5bbf86e0d7d28165e628210d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aws-xray-sdk \
python39-aws-xray-sdk \
python3dist-aws-xray-sdk"

RDEPENDS:${PN} += "python-abi \
python39-botocore \
python39-wrapt"

inherit rpm
