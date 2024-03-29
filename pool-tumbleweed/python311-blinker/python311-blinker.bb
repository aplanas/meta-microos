SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python311-blinker-1.6.2-3.1.noarch.rpm"
RPM_HASH = "7bf9b6bdfc1713b91c1576c98c2c9cc93441303ebaf9a6fd85e960c528dc4286b492d8247bc7ad7dd12be089db8dcb15765d5fb06b38467937376fe5a8f873b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blinker \
python3.11dist-blinker \
python311-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
