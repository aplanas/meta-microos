SUMMARY = "Library to control Elgato StreamDeck devices"
DESCRIPTION = "Python library to control Elgato StreamDeck devices."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python311-streamdeck-0.9.3-2.1.noarch.rpm"
RPM_HASH = "1c9095965976be768bcc7e9c34827465adc6d9e6d08d16de7eeb6d31eb6e4bf2a82311b77c9068cfb30620101597c20cd3cb7509c0d0fa9b9dbc54d29627d707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-streamdeck \
python3.11dist-streamdeck \
python311-streamdeck \
python3dist-streamdeck"

RDEPENDS:${PN} += "libhidapi-libusb0 \
python-abi"

inherit rpm
