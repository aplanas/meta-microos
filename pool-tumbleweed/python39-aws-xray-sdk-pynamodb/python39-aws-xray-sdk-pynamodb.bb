SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-pynamodb-2.12.0-2.3.noarch.rpm"
RPM_HASH = "8cf23d21d3635fe961d5c905c7726f133c68d97e190b5684d6cc202b5adc903049e4ef537ce1f3f6252961dd5534d82443af86f67af0e6a64a5a1c17c859463e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-pynamodb"

RDEPENDS:${PN} += "python-abi \
python39-aws-xray-sdk \
python39-pynamodb"

inherit rpm
