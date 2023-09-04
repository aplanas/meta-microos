SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python39-blinker-1.6.2-3.1.noarch.rpm"
RPM_HASH = "249e7560013bec434906b719b7a753805ea344d03ab0531c4bfedf06d3e4f8603fe7d7aaee34cff0f40d75e9139639f0f741a7a9f5430a52fb2c01d436cc511c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-blinker \
python39-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
