SUMMARY = "Full-featured Telegram client library for Python 3"
DESCRIPTION = "Telethon is an asyncio Python 3 MTProto library to interact with Telegram's API as a user or through a bot account (bot API alternative)."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "python311-Telethon-1.26.0-1.5.noarch.rpm"
RPM_HASH = "f12a2c05841ef551a7092e820f9e25efda76de2c47c984ff7d84a337cb76a59a4b6fa4eb490ed9cfc95de2974d6432caa6804382968767498ee9e63c225edef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(telethon) \
python311-Telethon \
python3dist(telethon)"

RDEPENDS:${PN} += "python(abi) \
python311-pyaes \
python311-rsa"

inherit rpm
