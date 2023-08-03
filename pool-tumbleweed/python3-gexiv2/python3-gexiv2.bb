SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the Python 3 bindings for the libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.2"

RPM_NAME = "python3-gexiv2-0.14.2-1.1.aarch64.rpm"
RPM_HASH = "0d96b47b4d3fdf050762d5a1a08a0ae32ed8ed2dc83a33f88eb833eda335b7356eb63b96bcc27800fa3319ab9068c62e9af35314b8d0eb3a261cbef787951f42"

RPROVIDES:${PN} += "python3-gexiv2"

RDEPENDS:${PN} += "python-abi \
python3-gobject \
typelib-GExiv2"

inherit rpm
