SUMMARY = "Python framework for Telegram Bot API"
DESCRIPTION = "Telepot helps you build applications for Telegram Bot API. It works on Python 2.7 and Python 3. It also has an async version based on asyncio and Python 3.5+."
LICENSE = "MIT"

PV = "12.7"

RPM_NAME = "python311-telepot-12.7-4.10.noarch.rpm"
RPM_HASH = "908a360a4cf6194ef77accb644cca554ce4c74d19972ee32b4f71f9970ae6669f2c99517816960ccca9d3e3cba8887cf0fb6157fec1d3442f1ba6cf44446ac7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(telepot) \
python311-telepot \
python3dist(telepot)"

RDEPENDS:${PN} += "python(abi) \
python311-urllib3"

inherit rpm
