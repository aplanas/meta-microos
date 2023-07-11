SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-bottle-2.12.0-2.3.noarch.rpm"
RPM_HASH = "dc5f4e6ceaf5c998e1d60224c4239539494a8a1a7672957c84ff3b2270d75f6eb2afd80219289a04eed480ec0e3abc741cfe493601c851b12a82d8b9d5b57c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-bottle"

RDEPENDS:${PN} += "python-abi \
python39-aws-xray-sdk \
python39-bottle"

inherit rpm
