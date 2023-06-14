SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-SQLAlchemy-2.12.0-1.1.noarch.rpm"
RPM_HASH = "c6355f2bb514de9746e669da500b3b8424171d89d8c92118a15adbffba11a58e7c2b2c1be9ac0afce5252af61905d2a0becf97c0eaf06d579d7a0516ce521937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-SQLAlchemy"

RDEPENDS:${PN} += "python-abi \
python311-SQLAlchemy \
python311-aws-xray-sdk"

inherit rpm
