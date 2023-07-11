SUMMARY = "Full-featured Telegram client library for Python 3"
DESCRIPTION = "Telethon is an asyncio Python 3 MTProto library to interact with Telegram's API as a user or through a bot account (bot API alternative)."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "python39-Telethon-1.26.0-1.7.noarch.rpm"
RPM_HASH = "5cf221cfd236890056c67ac6ddd8dcb778d4e260caa64c77d5f4025b4dc0e570ed170f96ee4e914e1152ab272ed1b0e31b9092d23823cca10a942bdc236129d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-telethon \
python39-Telethon \
python3dist-telethon"

RDEPENDS:${PN} += "python-abi \
python39-pyaes \
python39-rsa"

inherit rpm
