SUMMARY = "GLib-based Instant Messenger Library"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
This package provides the core libpurple library."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple0-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "799018b7ba0b1d26b8aba2ed580cb04bdd4b42eec850db3b405f0ca47610a52702bffa51fd71541122cd556aff9b42044cf7233eb62d7391ca3f72e98a0d4625"

RPROVIDES:${PN} += "libpurple.so.0 \
libpurple0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libfarstream-0.2.so.5 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libidn.so.12 \
libm.so.6 \
libxml2.so.2"

inherit rpm
