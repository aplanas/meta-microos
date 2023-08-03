SUMMARY = "Stream Deck tools (service, Web Interface, and UI)"
DESCRIPTION = "A service, Web Interface, and UI for interacting with your computer using a Stream Deck"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "streamdeck-ui-2.0.15-1.1.noarch.rpm"
RPM_HASH = "7e66dbb6e68c507cab0fc433f01e63203bd0a3cbcd598cdccdbbaa3f0eb980f79018f4a53aa04482ecb77b1efd326e0b4771a44460aef73f98cdf115333fac69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-streamdeck-ui \
python3dist-streamdeck-ui \
streamdeck-ui"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-CairoSVG \
python3-Pillow \
python3-evdev \
python3-filetype \
python3-pynput \
python3-pyside6 \
python3-python-xlib \
python3-streamdeck"

inherit rpm
