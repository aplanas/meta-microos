SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the Python 3 bindings for the libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "python3-gexiv2-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "e1f1275df87f0cd403efad27755c986e5491169af4c5e70519439d25d0e2f7dbf7bb47a4dbd2023db1d1df7f177cdd135ee576f725914ebc0d535ea290cc6412"

RPROVIDES:${PN} += "python3-gexiv2"

RDEPENDS:${PN} += "python-abi \
python3-gobject \
typelib-GExiv2"

inherit rpm
