SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-aiohttp-2.12.0-2.3.noarch.rpm"
RPM_HASH = "dd1e83508f6036f36b9aaac6026725e3299adba8de5b8bf9f232453392ccfc1d9e431156b063dbd9de4666a8775a8f7a1342c017b113fa835fda049394b1bf0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-aws-xray-sdk-aiohttp"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-aws-xray-sdk"

inherit rpm
