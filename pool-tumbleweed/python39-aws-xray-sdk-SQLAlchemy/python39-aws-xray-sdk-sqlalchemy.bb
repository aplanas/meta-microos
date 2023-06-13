SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-SQLAlchemy-2.12.0-1.1.noarch.rpm"
RPM_HASH = "bc8f80aa2195d6638170cf4ec033bbb559d950263648b17e2b98022a6752feec4170cea4fc58bcf51ba7025b4a1be4dada25739658a5d8d06612a68e9131e579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-SQLAlchemy"

RDEPENDS:${PN} += "python(abi) \
python39-SQLAlchemy \
python39-aws-xray-sdk"

inherit rpm
