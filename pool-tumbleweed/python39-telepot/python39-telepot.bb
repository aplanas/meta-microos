SUMMARY = "Python framework for Telegram Bot API"
DESCRIPTION = "Telepot helps you build applications for Telegram Bot API. It works on Python 2.7 and Python 3. It also has an async version based on asyncio and Python 3.5+."
LICENSE = "MIT"

PV = "12.7"

RPM_NAME = "python39-telepot-12.7-4.12.noarch.rpm"
RPM_HASH = "7e8866128a67da98652943965be7a847953b32ef905ed788695b487c88259b6ab3572a486daacaa4e0dac7ae2fcf4f550b69522a0c3d42dd03e13ee394d725b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-telepot \
python39-telepot \
python3dist-telepot"

RDEPENDS:${PN} += "python-abi \
python39-urllib3"

inherit rpm
