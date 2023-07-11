SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python39-blinker-1.6.2-1.3.noarch.rpm"
RPM_HASH = "a3a00f891e78450e4b376c66071fd8a2de636c484fd677d313b0590ccf481db8392b12516edc1e7cec1841ee902782e8b30c90a25fa4c947735606add992eac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-blinker \
python39-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
