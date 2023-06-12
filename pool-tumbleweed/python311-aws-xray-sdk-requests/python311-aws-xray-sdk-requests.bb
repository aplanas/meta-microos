SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-requests-2.12.0-1.1.noarch.rpm"
RPM_HASH = "3ac5fd0a980ee58811e3b1fea69d4ce2f0af77257375c14b34dafeb5d8ecf8a39ad35aa8972769139a87bd681d12c613fbc02bcb52bba19fa51146a3577707dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-requests"
RDEPENDS:${PN} += "python(abi) \
python311-aws-xray-sdk \
python311-requests"

inherit rpm
