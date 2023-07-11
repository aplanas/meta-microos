SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-psycopg2-2.12.0-2.3.noarch.rpm"
RPM_HASH = "a27ebc21fd5638c3b2f7c0e3c8222bd304db5163cc50cee36c337f6bd2dd08a4e5d6960249139169e86b1e0030851e004bde4b27e3fb19d7cfb350ddf6714e1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-psycopg2"

RDEPENDS:${PN} += "python-abi \
python310-aws-xray-sdk \
python310-psycopg2"

inherit rpm
