SUMMARY = "Library to control Elgato StreamDeck devices"
DESCRIPTION = "Python library to control Elgato StreamDeck devices."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python39-streamdeck-0.9.3-2.1.noarch.rpm"
RPM_HASH = "bc1129c9955c181c2fbca80f8ea16f4fb6e0d8ad0fffc048c27446d7d5d11f71f10d44eca3df3af2df26bbb4bb5f28a870ee803420762a44e2b79a297e0d6acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-streamdeck \
python39-streamdeck \
python3dist-streamdeck"

RDEPENDS:${PN} += "libhidapi-libusb0 \
python-abi"

inherit rpm
