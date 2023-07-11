SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-psycopg2-2.12.0-2.3.noarch.rpm"
RPM_HASH = "20095ef9c4665db970d3d8198279f212f5dd0692a606841de2d4ea0b8c48becc5282489601f472e8b5e1fc77a42a867684cfbd9ccc13b043d64f02e80ec5eb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-psycopg2"

RDEPENDS:${PN} += "python-abi \
python39-aws-xray-sdk \
python39-psycopg2"

inherit rpm
