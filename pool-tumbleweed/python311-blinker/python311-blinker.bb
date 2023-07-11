SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python311-blinker-1.6.2-1.3.noarch.rpm"
RPM_HASH = "01851be88bb874564f3292ffe4e4bffdf3e29ba3c0f81d12e8b58a38da576a068fadc16a841dd67dcb32a63fc85c6bb5e3b64e1ee9861e87d37eb46bdf8b46ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blinker \
python3.11dist-blinker \
python311-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
