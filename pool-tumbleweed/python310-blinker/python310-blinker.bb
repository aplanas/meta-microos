SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python310-blinker-1.6.2-1.3.noarch.rpm"
RPM_HASH = "c52c66ae561b7ca2b005c9b4c3ad09ce10e905ec757727b1197048dd9f662f60886c9cd9a0934fb1dbf2158d1985bd0471a44f30448d14c11fe85774688730a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-blinker \
python310-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
