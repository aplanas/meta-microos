SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-bottle-2.12.0-2.3.noarch.rpm"
RPM_HASH = "56b6542e276b574f658c729a92d0595e0564bcbb0e0d0770b82f0ef99408a51abb0d89a4d30a91304951516a5384ec4732362b57848ea2222b270ba5e55ad88e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-bottle"

RDEPENDS:${PN} += "python-abi \
python310-aws-xray-sdk \
python310-bottle"

inherit rpm
