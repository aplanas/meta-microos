SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-aiohttp-2.12.0-1.1.noarch.rpm"
RPM_HASH = "e0c8390d735b5c0f749cebf7f9843b6cf884bccbf56df71a843affdeb226106316902ba0ef036eb5d24e327457361585dc5fe98d7a1ab0cd8b27d27a46eb773f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-aiohttp"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-aws-xray-sdk"

inherit rpm
