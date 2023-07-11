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

RPM_NAME = "python-blinker-doc-1.6.2-1.3.noarch.rpm"
RPM_HASH = "70c327a340458b22f391bc83d90434918cd4ac76aa2622027dc3ccf4922c768fe9ae8af5ef59952d312e9486788a136cbdf8a11247e94095fe9e8ca0c9130dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blinker-doc \
python310-blinker-doc \
python311-blinker-doc \
python39-blinker-doc"

RDEPENDS:${PN} += ""

inherit rpm
