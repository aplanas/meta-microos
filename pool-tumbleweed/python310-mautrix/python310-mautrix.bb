SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.19.15"

RPM_NAME = "python310-mautrix-0.19.15-1.4.noarch.rpm"
RPM_HASH = "a93e49c8a19bd1f6fdc3cde03024b7ebf50d81aeca8bc671945ba4db27e75afb425d551569aad4dfa5cd2ae936e70855f4dba15aa238e549c9c63ee29c89e29e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mautrix \
python310-mautrix \
python3dist-mautrix"

RDEPENDS:${PN} += "python-abi \
python310-aiohttp \
python310-attrs \
python310-yarl"

inherit rpm
