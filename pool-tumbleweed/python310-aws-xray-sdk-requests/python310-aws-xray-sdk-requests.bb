SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-requests-2.12.0-2.3.noarch.rpm"
RPM_HASH = "eea94b774f78008a6313224345b19aac320f1c04948a5a3337bc198a6997c14580f9f7f2e68ae0ce9072057e4cc418be5db3b14f5d752476a3d962afbb624371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-requests"

RDEPENDS:${PN} += "python-abi \
python310-aws-xray-sdk \
python310-requests"

inherit rpm
