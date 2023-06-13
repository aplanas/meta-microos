SUMMARY = "Python framework for Telegram Bot API"
DESCRIPTION = "Telepot helps you build applications for Telegram Bot API. It works on Python 2.7 and Python 3. It also has an async version based on asyncio and Python 3.5+."
LICENSE = "MIT"

PV = "12.7"

RPM_NAME = "python310-telepot-12.7-4.10.noarch.rpm"
RPM_HASH = "0391c7242936fcc390c6b7f7b8cc34261a918f48b758b0def59fa72b4ea5a5f0493aa569cb19d43f165e0baf60552b3da1afc91b14d9fe8375f99766723fa4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-telepot \
python3.10dist(telepot) \
python310-telepot \
python3dist(telepot)"

RDEPENDS:${PN} += "python(abi) \
python3-aiohttp \
python310-urllib3"

inherit rpm
