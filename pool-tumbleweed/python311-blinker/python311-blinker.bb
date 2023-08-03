SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python311-blinker-1.6.2-2.1.noarch.rpm"
RPM_HASH = "d8eb868a5c8f613650651ec45ab9b7a400216167a1c61b117ceff47177c138b27d77d309b9112f8e7b0cb92a8d072aaca8f013b11c9336bed5bd2d2b3e5860c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blinker \
python3.11dist-blinker \
python311-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
