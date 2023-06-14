SUMMARY = "Python bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the python bindings for AT-SPI."
LICENSE = "LGPL-2.0-only"

PV = "2.46.0"

RPM_NAME = "python39-atspi-2.46.0-1.3.noarch.rpm"
RPM_HASH = "d65fc1204b2f24529beb508844178aedb6de3cae6a1180a004e54c15b039ef1b3578ac890904c28cc39b049ca50c6749a0e181fa809969479123623764610218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-atspi"

RDEPENDS:${PN} += "python-abi \
python39-dbus-python \
python39-gobject \
typelib-Atspi \
typelib-GLib \
typelib-GObject"

inherit rpm
