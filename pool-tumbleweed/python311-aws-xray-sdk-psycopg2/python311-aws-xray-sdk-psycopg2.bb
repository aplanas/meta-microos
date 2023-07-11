SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-psycopg2-2.12.0-2.3.noarch.rpm"
RPM_HASH = "8bc8d16288e897dad82219f09b39a3e31b37bbd8faab98f13fee1314194d6c23d5264ec440de214298a9574899dcd6b0d47cc23684475d980959bf0608eb0da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-psycopg2 \
python311-aws-xray-sdk-psycopg2"

RDEPENDS:${PN} += "python-abi \
python311-aws-xray-sdk \
python311-psycopg2"

inherit rpm
