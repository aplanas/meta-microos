SUMMARY = "Thunar extension for Font Manager"
DESCRIPTION = "This package provides integration with the Thunar file manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "thunar-font-manager-0.8.8-2.3.aarch64.rpm"
RPM_HASH = "6fc263363965959565b0a173c54f2dfc7096f1f75fda723a8b5c6416ff09f5af461461b17f71da5b8cd1ab6efd02210f0ef715a34a03b3950f56074e3aa77f47"

RPROVIDES:${PN} += "thunar-font-manager"

RDEPENDS:${PN} += "font-manager-common \
font-viewer \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libthunarx-3.so.0"

inherit rpm
