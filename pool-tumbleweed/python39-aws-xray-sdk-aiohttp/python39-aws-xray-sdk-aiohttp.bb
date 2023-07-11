SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-aiohttp-2.12.0-2.3.noarch.rpm"
RPM_HASH = "242f52f166f6de20548f760d4df55f9cabd7fe00bc0736abda1e44794ca60555ee37586fba7fb1749e8e1dcd27fc05b8c64f15761aa27fe973a7af2a8a0d386d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-aiohttp"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-aws-xray-sdk"

inherit rpm
