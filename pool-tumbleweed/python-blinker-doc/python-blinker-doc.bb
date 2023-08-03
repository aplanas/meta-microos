SUMMARY = "Documentation for python-blinker"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender. \
 \
This sub-package contains the HTML documentation."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python-blinker-doc-1.6.2-2.1.noarch.rpm"
RPM_HASH = "b1dddfa43123ac53c76cf565760db97836a4dbb98679bb42beef03c58d6ae5bacc1029284f259c7dae0447b77c0689895f23e3e5906e9f5662490b2f84487c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blinker-doc \
python310-blinker-doc \
python311-blinker-doc \
python39-blinker-doc"

RDEPENDS:${PN} += ""

inherit rpm
