SUMMARY = "FontAwesome icons in PyQt and PySide applications"
DESCRIPTION = "QtAwesome enables iconic fonts such as Font Awesome and \
Elusive Icons in PyQt and PySide applications. \
 \
It is a port to Python - PyQt / PySide of the QtAwesome C++ \
library by Rick Blommers."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-QtAwesome-1.2.1-1.5.noarch.rpm"
RPM_HASH = "6ae390c9eb52692bba49f8dec80f153ce6a61f9d6dabd1b651a57c8af25aa7ed39b4c9aad7a5250052ab9de288a258fa258dcd62131d36814d80ac3c319f2dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-qtawesome \
python311-QtAwesome \
python3dist-qtawesome"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-QtPy \
update-alternatives"

inherit rpm
