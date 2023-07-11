SUMMARY = "Command line VNC client"
DESCRIPTION = "Command line VNC client."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-vncdotool-1.0.0-6.3.noarch.rpm"
RPM_HASH = "16b069014e25e969e00216c75a52fa8b81bdf9389a55e21ecb406d30fe213c0914e2c73debd7b74564fc6ad022bcbc39c30bb22f62b71f9daf50af66faffe361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vncdotool \
python3.11dist-vncdotool \
python311-vncdotool \
python3dist-vncdotool"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-Twisted \
update-alternatives"

inherit rpm
