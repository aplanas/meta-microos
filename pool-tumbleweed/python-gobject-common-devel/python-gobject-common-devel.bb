SUMMARY = "Shared development files for GObject's Python bindings"
DESCRIPTION = "This package contains common files required to build wrappers for gobject \
addon libraries such as pygtk in both Python2 and Python3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python-gobject-common-devel-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "92d5b5cb857ef999996693143fc924664ffece7a8802662cefd4844bc05c41f99c082eb08f5b1e95bc8445120f2d0972d9b29d58728f214d60ed26a5ca5b9428"

RPROVIDES:${PN} += "pkgconfig(pygobject-3.0) \
python-gobject-common-devel \
python-gobject-common-devel(aarch-64) \
python310-gobject-common-devel \
python311-gobject-common-devel \
python39-gobject-common-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
gobject-introspection-devel \
libffi-devel \
pkgconfig(cairo) \
pkgconfig(cairo-gobject) \
pkgconfig(gobject-2.0) \
pkgconfig(libffi)"

inherit rpm
