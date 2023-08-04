SUMMARY = "Stream Deck tools (service, Web Interface, and UI)"
DESCRIPTION = "A service, Web Interface, and UI for interacting with your computer using a Stream Deck"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "streamdeck-ui-2.0.15-2.1.noarch.rpm"
RPM_HASH = "02c0d2db680105558aef532240dab314d0d1e723a8468b5da9a3ddcddd1ec15e0ffae8806a85e7a8fe53c6bdcf423f9376eb0ceaf6f27c6e26f5b2ce4e61d588"
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
python3-setuptools \
python3-streamdeck"

inherit rpm
