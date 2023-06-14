SUMMARY = "Full-featured Telegram client library for Python 3"
DESCRIPTION = "Telethon is an asyncio Python 3 MTProto library to interact with Telegram's API as a user or through a bot account (bot API alternative)."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "python310-Telethon-1.26.0-1.5.noarch.rpm"
RPM_HASH = "ec166822bfa583502276c4e360555865b7eafcfa09bc5b7800350164bb2d9c35323ba8a905feee2e1803f8d8376825bfbc59a2fc2fe5df906ae9c9878e25d3f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Telethon \
python3.10dist-telethon \
python310-Telethon \
python3dist-telethon"

RDEPENDS:${PN} += "python-abi \
python310-pyaes \
python310-rsa"

inherit rpm
