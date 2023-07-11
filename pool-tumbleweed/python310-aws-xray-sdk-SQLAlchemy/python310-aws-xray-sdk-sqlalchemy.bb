SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-SQLAlchemy-2.12.0-2.3.noarch.rpm"
RPM_HASH = "1907a6be27ac9373105c2d9bcd0f626aa3db175da7fce40f6f5fa1cd22d69a43e8195c1b0cac313371def2c8300b0381aeae2ef34c4d89b5fbc31af589f059c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-SQLAlchemy"

RDEPENDS:${PN} += "python-abi \
python310-SQLAlchemy \
python310-aws-xray-sdk"

inherit rpm
