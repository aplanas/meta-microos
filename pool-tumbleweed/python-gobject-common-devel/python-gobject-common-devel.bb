SUMMARY = "Shared development files for GObject's Python bindings"
DESCRIPTION = "This package contains common files required to build wrappers for gobject \
addon libraries such as pygtk in both Python2 and Python3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python-gobject-common-devel-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "f1e70e172ec13f94d8ca40b0b8ac249399355075e5caeebd550436a2402f2362dd48d27f245364d2375101ba9edf62661d66af4c67b0d7e33a08f31f0362749e"

RPROVIDES:${PN} += "pkgconfig-pygobject-3.0 \
python-gobject-common-devel \
python310-gobject-common-devel \
python311-gobject-common-devel \
python39-gobject-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
gobject-introspection-devel \
libffi-devel \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-gobject-2.0 \
pkgconfig-libffi"

inherit rpm
