SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python310-blinker-1.6.2-3.1.noarch.rpm"
RPM_HASH = "fd03d383d783c6296141d9b18d50ca592c3f815ffde0286ff13fceb79758e3c73175aaca9461fba4993d1f6e1d8627e41cb6f36c984a59b1e645797edc4459ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-blinker \
python310-blinker \
python3dist-blinker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
