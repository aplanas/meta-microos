SUMMARY = "Python bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the python bindings for AT-SPI."
LICENSE = "LGPL-2.0-only"

PV = "2.46.0"

RPM_NAME = "python311-atspi-2.46.0-1.4.noarch.rpm"
RPM_HASH = "faf376750eba924382a8c75fd88bd201d759b4c86397f2f1d5b2ff34d92fe1d0371d816491f14844a601702d596b37370526ce2c0244551cd8e586c6cea32ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "py3atspi \
python3-atspi \
python311-atspi"

RDEPENDS:${PN} += "python-abi \
python311-dbus-python \
python311-gobject \
typelib-Atspi \
typelib-GLib \
typelib-GObject"

inherit rpm
