SUMMARY = "Flaks backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-Flask-2.12.0-2.3.noarch.rpm"
RPM_HASH = "b61df17d919d429956cd011ab2e3adc5ec18244afb94222381a35d19da9115e739b02f0bdaf41bad949e86e5c4fd013b1b81b688891d4528ec57d99210cd1cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-Flask"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-aws-xray-sdk"

inherit rpm
