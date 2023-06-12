SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-psycopg2-2.12.0-1.1.noarch.rpm"
RPM_HASH = "93aff421dca8e2fc7a4ad78d374e760b5340ea701fcdbba39d66a6278d7dda93ba2a17a54a2151dc229443db666cfb44995975afa194752af0b30c2755129ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-psycopg2"
RDEPENDS:${PN} += "python(abi) \
python39-aws-xray-sdk \
python39-psycopg2"

inherit rpm
