SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-requests-2.12.0-2.3.noarch.rpm"
RPM_HASH = "5d7c9d2c84b95b933e3c272565e0e27118591e0351ea8e9b1bdce2e6ba399bcc06d203bf54e7a5b7ff1a312f3360a889f62a97906b6555e2d7daf18f35582871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-requests"

RDEPENDS:${PN} += "python-abi \
python39-aws-xray-sdk \
python39-requests"

inherit rpm
