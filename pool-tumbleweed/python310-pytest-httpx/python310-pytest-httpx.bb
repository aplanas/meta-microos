SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python310-pytest-httpx-0.22.0-1.1.noarch.rpm"
RPM_HASH = "97b37514a9d778411e68b099517fa6a9e98fcdc28cc4806ff84d2d6d42a9a0c72ef61044ac741d9dfd4c615d7fdb6c46795f628de2d8ca1b6263e718d9109cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpx \
python3.10dist-pytest-httpx \
python310-pytest-httpx \
python3dist-pytest-httpx"

RDEPENDS:${PN} += "python-abi \
python310-httpx \
python310-pytest"

inherit rpm
