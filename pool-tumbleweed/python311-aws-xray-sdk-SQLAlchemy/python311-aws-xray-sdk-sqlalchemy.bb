SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-SQLAlchemy-2.12.0-2.3.noarch.rpm"
RPM_HASH = "8e6a44755af015f9641dc14f86f1484b0f3d6a731760c08da36e84ae61a2c43b3aa4b29f65275d2162afa38b2ad65ab26668410d71a7f1c9b70ed95e27c470a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-SQLAlchemy \
python311-aws-xray-sdk-SQLAlchemy"

RDEPENDS:${PN} += "python-abi \
python311-SQLAlchemy \
python311-aws-xray-sdk"

inherit rpm
