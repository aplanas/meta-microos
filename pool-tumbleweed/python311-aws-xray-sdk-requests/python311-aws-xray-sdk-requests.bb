SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-requests-2.12.0-2.3.noarch.rpm"
RPM_HASH = "d588ebdd2645609930659b613c428dda6732977bf7f5bcede0e9089898fbcf15a5317ca8351cffb2f0e67753e7f0c6dc2bd7f487860f5527c38af4ed1b2c18f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-requests \
python311-aws-xray-sdk-requests"

RDEPENDS:${PN} += "python-abi \
python311-aws-xray-sdk \
python311-requests"

inherit rpm
