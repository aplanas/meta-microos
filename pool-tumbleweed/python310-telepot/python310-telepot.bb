SUMMARY = "Python framework for Telegram Bot API"
DESCRIPTION = "Telepot helps you build applications for Telegram Bot API. It works on Python 2.7 and Python 3. It also has an async version based on asyncio and Python 3.5+."
LICENSE = "MIT"

PV = "12.7"

RPM_NAME = "python310-telepot-12.7-4.12.noarch.rpm"
RPM_HASH = "5aceaeff0059a6abced4826caeac38d2b6630f9aa5cb6e3c0a018515b569e603073ac1f7b42be32a096c9fd3da889317cc530d0061b5172bc6f71904ea21c597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-telepot \
python310-telepot \
python3dist-telepot"

RDEPENDS:${PN} += "python-abi \
python310-urllib3"

inherit rpm
