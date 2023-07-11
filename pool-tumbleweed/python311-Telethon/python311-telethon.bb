SUMMARY = "Full-featured Telegram client library for Python 3"
DESCRIPTION = "Telethon is an asyncio Python 3 MTProto library to interact with Telegram's API as a user or through a bot account (bot API alternative)."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "python311-Telethon-1.26.0-1.7.noarch.rpm"
RPM_HASH = "d4177f73af6a98752e6afc660b5ecb171e2b1c37c02b0c53be5494aee68ef396236ea0934e7554af6f275fb71664cf1f090de230771b6c13364bb8dfbfeaf5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Telethon \
python3.11dist-telethon \
python311-Telethon \
python3dist-telethon"

RDEPENDS:${PN} += "python-abi \
python311-pyaes \
python311-rsa"

inherit rpm
