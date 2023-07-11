SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python39-aws-xray-sdk as recommended packages."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-all-2.12.0-2.3.noarch.rpm"
RPM_HASH = "40c6b2a15ac41bb738510de385e0ed2701d391162712a55899ae63ef39ef71ae7aaf509153b9de8de2dd99c7640fce2935c6dcb4ca493278942719e58a464562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-all"

RDEPENDS:${PN} += "python39-aws-xray-sdk"

inherit rpm
