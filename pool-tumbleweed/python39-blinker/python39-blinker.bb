SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python39-blinker-1.6.2-2.1.noarch.rpm"
RPM_HASH = "386e306312b51b7aa32020fc8b753fbc5508e2b32fe58f5f86a212a716f3862fb70cf9154d21d66f117885da360fd3e3dd3e57ce4ac0dd58ef3e6d53dc5b949d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-blinker \
python39-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
