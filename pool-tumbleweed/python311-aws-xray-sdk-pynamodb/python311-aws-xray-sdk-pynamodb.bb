SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-pynamodb-2.12.0-1.1.noarch.rpm"
RPM_HASH = "9600476294f50f94894b575c3066d6bb69e6d4ae38bd6af74d4d81c938083a4a946bf9fcd838d65525ecf7eea84649ee287b518cd8117a3336e0b261608c6eec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-pynamodb"

RDEPENDS:${PN} += "python-abi \
python311-aws-xray-sdk \
python311-pynamodb"

inherit rpm
