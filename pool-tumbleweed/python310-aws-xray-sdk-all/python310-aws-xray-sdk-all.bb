SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python310-aws-xray-sdk as recommended packages."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-all-2.12.0-2.3.noarch.rpm"
RPM_HASH = "7910cfe6da7fb8553d8c5c376dfbcb5291b334d21c4b19b8e0fc9594ff044b61bc037e4cdcc33d1892db0ab5de2cc61900471cb65cadbbf8377d15f82d713fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-all"

RDEPENDS:${PN} += "python310-aws-xray-sdk"

inherit rpm
