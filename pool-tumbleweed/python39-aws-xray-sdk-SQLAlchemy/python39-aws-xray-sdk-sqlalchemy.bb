SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-SQLAlchemy-2.12.0-2.3.noarch.rpm"
RPM_HASH = "05ebbec3647b8c947e52f81f37ce3d8e0b1d1d2069af73397c06ca59cc6d658166edcac45f816571ff634a0e4f9cd23b74ff7c4e1e646e9dee7f41e345cdd4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-SQLAlchemy"

RDEPENDS:${PN} += "python-abi \
python39-SQLAlchemy \
python39-aws-xray-sdk"

inherit rpm
