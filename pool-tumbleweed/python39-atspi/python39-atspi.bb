SUMMARY = "Python bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the python bindings for AT-SPI."
LICENSE = "LGPL-2.0-only"

PV = "2.46.0"

RPM_NAME = "python39-atspi-2.46.0-1.4.noarch.rpm"
RPM_HASH = "36b5ed84558cda0b5b53312faaca38ab56bf8047f88cb64bfcf8f4ac652750ef2240ef565c000776e4dbdd528b207137af230fdd7ce4a5917e74c783c3f0033c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-atspi"

RDEPENDS:${PN} += "python-abi \
python39-dbus-python \
python39-gobject \
typelib-Atspi \
typelib-GLib \
typelib-GObject"

inherit rpm
