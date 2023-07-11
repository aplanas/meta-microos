SUMMARY = "Panel indicator applet library for GTK+2"
DESCRIPTION = "This package provides the libraries required to build indicators \
and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "libindicator7-16.10.0+bzr20171205-4.16.aarch64.rpm"
RPM_HASH = "2c6176acae42afb007e74eac8ce5174089d0e21495c9c0244c86495c1049b5382a75e39902b7fea8a2accf143b727681b56b703324cb4159fc4776e745b91cb2"

RPROVIDES:${PN} += "libindicator.so.7 \
libindicator7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
