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

RPM_NAME = "python-blinker-doc-1.6.2-1.1.noarch.rpm"
RPM_HASH = "1ad2be2e686378db5d9adafe3be0740b0d82b84e5a972b3f8d3c7a15cfc4f2f14c8d0e253872df0705938c2d2c92d9aaa21a440a44237ca90e8f8cbb9dc49a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-blinker-doc \
python310-blinker-doc \
python311-blinker-doc \
python39-blinker-doc"
RDEPENDS:${PN} += ""

inherit rpm
