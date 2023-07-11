SUMMARY = "Development files for libgxps, a XPS document render library"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libgxps-devel-0.3.2-1.12.aarch64.rpm"
RPM_HASH = "6e786cf0777e2219741494fdd21d452d9040edbccb6cbab3e884bdb42568d05f427f58797cb02ba419f2302573fee3e1d18f44186c8e05fa0ebbb72dc2eaef4a"

RPROVIDES:${PN} += "libgxps-devel \
pkgconfig-libgxps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgxps2 \
pkgconfig-cairo \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libarchive \
typelib-1-0-GXPS-0-1"

inherit rpm
