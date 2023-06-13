SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-bottle-2.12.0-1.1.noarch.rpm"
RPM_HASH = "b0cddcac03fc628f155ee2f8c6709a0d5322dccdddd8c245f8be9670103937a70faac8dc818dd1e0ed35dd434bec969c7fd171f98ae5cfe9024ca16c47bddf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-bottle \
python310-aws-xray-sdk-bottle"

RDEPENDS:${PN} += "python(abi) \
python310-aws-xray-sdk \
python310-bottle"

inherit rpm
