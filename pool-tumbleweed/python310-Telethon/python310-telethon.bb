SUMMARY = "Full-featured Telegram client library for Python 3"
DESCRIPTION = "Telethon is an asyncio Python 3 MTProto library to interact with Telegram's API as a user or through a bot account (bot API alternative)."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "python310-Telethon-1.26.0-1.7.noarch.rpm"
RPM_HASH = "3e6d93115b94acd47889d67c1a972cd806eb9bcc8fdebf0afb4c736cd2869ddada75e85e2c41f9cd1328b48a655830f7b07a8db466ea4f42ed46ea82c066c0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-telethon \
python310-Telethon \
python3dist-telethon"

RDEPENDS:${PN} += "python-abi \
python310-pyaes \
python310-rsa"

inherit rpm
