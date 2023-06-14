SUMMARY = "Command line VNC client"
DESCRIPTION = "Command line VNC client."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-vncdotool-1.0.0-5.4.noarch.rpm"
RPM_HASH = "911078bc89636300c584d5ad18b15929d7e0988136445955b683ee066e33e688f21f7d240487d1a462ff630b6a6aff134c03e1908d188ef24c224ef37384a163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-vncdotool \
python311-vncdotool \
python3dist-vncdotool"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Pillow \
python311-Twisted \
update-alternatives"

inherit rpm
