SUMMARY = "Library to control Elgato StreamDeck devices"
DESCRIPTION = "Python library to control Elgato StreamDeck devices."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python310-streamdeck-0.9.3-2.1.noarch.rpm"
RPM_HASH = "4cd66053aae54feb401bdbdd76ee8fc1b8d9b7afa4d3ad5bec5f9fbd13ec23b7a7e0f822f2f21c0ce59f18c7218eb7a4614ded713502d1465fbb72decf4d09ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-streamdeck \
python310-streamdeck \
python3dist-streamdeck"

RDEPENDS:${PN} += "libhidapi-libusb0 \
python-abi"

inherit rpm
