SUMMARY = "Python framework for Telegram Bot API"
DESCRIPTION = "Telepot helps you build applications for Telegram Bot API. It works on Python 2.7 and Python 3. It also has an async version based on asyncio and Python 3.5+."
LICENSE = "MIT"

PV = "12.7"

RPM_NAME = "python311-telepot-12.7-4.12.noarch.rpm"
RPM_HASH = "89237dcadf2ff2170cff5fcf3fddb95b5198f743926049db719a4bd38e7d6ad4e65c164a638e1e2676d8a5015714ab6dae456cbeb3e513e8773dbdb1429bce51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-telepot \
python3.11dist-telepot \
python311-telepot \
python3dist-telepot"

RDEPENDS:${PN} += "python-abi \
python3-aiohttp \
python311-urllib3"

inherit rpm
