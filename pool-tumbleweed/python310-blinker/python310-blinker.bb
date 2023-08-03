SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python310-blinker-1.6.2-2.1.noarch.rpm"
RPM_HASH = "3753b3a1e8249b1e1718266e0039f27b332879e473619c55451b2a2432a071622f652c2d0623ab13d9e7371631429ad52e894ea9ae25178f61aa5f3a73af3b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-blinker \
python310-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
