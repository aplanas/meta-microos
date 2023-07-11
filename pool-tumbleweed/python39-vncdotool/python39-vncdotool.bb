SUMMARY = "Command line VNC client"
DESCRIPTION = "Command line VNC client."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-vncdotool-1.0.0-6.3.noarch.rpm"
RPM_HASH = "4be5e3727e0d24d99b28f803e9af19c6b1b9f64d705d9f93ec3d23af9f6572299cfa90df7b7d099452c36678f45ca47ec048f05f9a8c0b7375b192b39c87ee06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vncdotool \
python39-vncdotool \
python3dist-vncdotool"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-Twisted \
update-alternatives"

inherit rpm
