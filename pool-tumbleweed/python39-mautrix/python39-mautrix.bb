SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.19.15"

RPM_NAME = "python39-mautrix-0.19.15-1.4.noarch.rpm"
RPM_HASH = "46227a037f8c86a7d82ab74b1f144c10de8aef9898328d62dfca96d813c5fe7d1055c947fb7df76b4c1bb0cc9413052f4903a3e684b0181e7d9ca61492bcef7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mautrix \
python39-mautrix \
python3dist-mautrix"

RDEPENDS:${PN} += "python-abi \
python39-aiohttp \
python39-attrs \
python39-yarl"

inherit rpm
