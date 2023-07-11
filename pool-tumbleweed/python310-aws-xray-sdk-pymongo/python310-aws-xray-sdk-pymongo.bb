SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-pymongo-2.12.0-2.3.noarch.rpm"
RPM_HASH = "25567b4b84eed5de326d97870fb0d48934ccf8f72e8a8f1e1d8988fb2a9400be1a30c164b2c004ee0486739f21dce29f121e5549edb1590a7355041a6832ff3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-pymongo"

RDEPENDS:${PN} += "python-abi \
python310-aws-xray-sdk \
python310-pymongo"

inherit rpm
