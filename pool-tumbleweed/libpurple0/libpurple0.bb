SUMMARY = "GLib-based Instant Messenger Library"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
This package provides the core libpurple library."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple0-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "5946becb5704e4a8395e630bc6780527177fa73b8081c3610ef821dea6cf06672d1950ee7641f1d80f154ce4c609535056e55f2738300c35a2e5afe528829d46"

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
