SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-aiohttp-2.12.0-2.3.noarch.rpm"
RPM_HASH = "a7ffc00ef0c4f5c79566ee8fca9db33b224472d96cfa0d023105473faaede65865d3362a78caa8a7ec55eb4b7235b4f8c25128ac598f94451f1c4574275b05a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-aiohttp \
python311-aws-xray-sdk-aiohttp"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-aws-xray-sdk"

inherit rpm
