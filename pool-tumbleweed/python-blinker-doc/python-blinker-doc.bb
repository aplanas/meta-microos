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

RPM_NAME = "python-blinker-doc-1.6.2-3.1.noarch.rpm"
RPM_HASH = "642d065cfc22702905c1351710c057272f7c0cdfa7562cb61496da38ce2168a352dc18765c1d886af72828e8301c2247b4ef695efca943f1d178059eda4fec40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blinker-doc \
python310-blinker-doc \
python311-blinker-doc \
python39-blinker-doc"

RDEPENDS:${PN} += ""

inherit rpm
