SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-requests-2.12.0-1.1.noarch.rpm"
RPM_HASH = "03d306392af1362dbf6cd00a113b65c375093e929a524d95d56f664c40e898429bc25ef8e66ab1ff5d890b17620526cee51b63496b5e16be8a8d52d6ef508eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-requests \
python310-aws-xray-sdk-requests"

RDEPENDS:${PN} += "python(abi) \
python310-aws-xray-sdk \
python310-requests"

inherit rpm
