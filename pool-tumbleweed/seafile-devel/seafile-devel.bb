SUMMARY = "Development files for seafile"
DESCRIPTION = "The seafile-devel package contains libraries and header files for \
developing applications that use seafile."
LICENSE = "GPL-2.0-only"

PV = "9.0.3"

RPM_NAME = "seafile-devel-9.0.3-1.1.aarch64.rpm"
RPM_HASH = "2f210273245040fd1d284e6831c2961aaf7cf9e3ec6d44ebffb41fc2bc81591d4aa5ded288e8f9c41b66a855c774db7261961916c16fef1cb201bb052b7bb433"

RPROVIDES:${PN} += "pkgconfig-libseafile \
seafile-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
seafile"

inherit rpm
