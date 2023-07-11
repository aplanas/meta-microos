SUMMARY = "A GObject-based Exiv2 wrapper"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the Python 3 bindings for the libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "python3-gexiv2-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "4fed5b2979fc4c7a6c49219c4051dbdd6736e14d12628c33be9157048d39576722bbeca0934ad4ae5f0e23022a06f96226f8e037d0bcb6a311bcfc0a78e18fee"

RPROVIDES:${PN} += "python3-gexiv2"

RDEPENDS:${PN} += "python-abi \
python3-gobject \
typelib-GExiv2"

inherit rpm
