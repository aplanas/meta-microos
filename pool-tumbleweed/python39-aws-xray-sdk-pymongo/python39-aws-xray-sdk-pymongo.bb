SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-pymongo-2.12.0-1.1.noarch.rpm"
RPM_HASH = "cec0fb349e5090cb6ba41ca8da8f1363ac86e35518d1fb4d0e1677954d290b1b2fdf4519f33b030ca8f1d757660bcf01580fd1cd831ed0a58b49828b16664ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-pymongo"

RDEPENDS:${PN} += "python-abi \
python39-aws-xray-sdk \
python39-pymongo"

inherit rpm
