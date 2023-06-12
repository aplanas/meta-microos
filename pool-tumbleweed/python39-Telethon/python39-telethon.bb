SUMMARY = "Full-featured Telegram client library for Python 3"
DESCRIPTION = "Telethon is an asyncio Python 3 MTProto library to interact with Telegram's API as a user or through a bot account (bot API alternative)."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "python39-Telethon-1.26.0-1.5.noarch.rpm"
RPM_HASH = "0d4ea57aa71248fd516ae180fdb78d2834da03c45a85fd3ad303919c3e002b56f491076be15c22cd1802f9a027ee84602813d0e8b5d96735000b90703398ac1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(telethon) \
python39-Telethon \
python3dist(telethon)"
RDEPENDS:${PN} += "python(abi) \
python39-pyaes \
python39-rsa"

inherit rpm
