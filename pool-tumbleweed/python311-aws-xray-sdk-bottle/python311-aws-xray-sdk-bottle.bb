SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-bottle-2.12.0-1.1.noarch.rpm"
RPM_HASH = "c5627e1aec9de842d484ae63aaac339f917a2fcb3a8a3b15e98bd5606b732363b8c03d144655d6fc054686920ea2a32fc51e10f5894619c245af1b9f25d1f433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-bottle"

RDEPENDS:${PN} += "python-abi \
python311-aws-xray-sdk \
python311-bottle"

inherit rpm
