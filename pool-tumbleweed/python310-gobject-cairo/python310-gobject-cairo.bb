SUMMARY = "Python bindings for GObject/Cairo"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Cairo bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python310-gobject-cairo-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "6c46ed15693d097604f8d2688d4ca6d7ae725c7ac067677930fd1e84a3b9693a3db4dcb9891935ea01c62cba031acd4af7fe8ebfb0b17d7aec38ee1d3854d0a8"

RPROVIDES:${PN} += "python310-gobject-cairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgobject-2.0.so.0 \
python-abi \
python310-cairo \
python310-gobject"

inherit rpm
