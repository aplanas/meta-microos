SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-pynamodb-2.12.0-2.3.noarch.rpm"
RPM_HASH = "34d5a6f503abcf154d01f55997ba4d185e929e481b34698aaf64575dc69c6abd7edd44d5e9356b1fa41405d540b88e74aaf16e71cd7c584a12ed57a516df0921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-pynamodb"

RDEPENDS:${PN} += "python-abi \
python310-aws-xray-sdk \
python310-pynamodb"

inherit rpm
