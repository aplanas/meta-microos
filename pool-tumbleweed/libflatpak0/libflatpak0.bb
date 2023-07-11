SUMMARY = "OSTree based application bundle management library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "libflatpak0-1.14.4-1.3.aarch64.rpm"
RPM_HASH = "a1dc1c3b14ae40206c176a1c9a1299e3accc7ca073296bcb2b48cd83a7c30671d60384fca264886aa092f912a9adbb966cf6413917c44c91ec23481524f58edb"

RPROVIDES:${PN} += "libflatpak.so.0 \
libflatpak0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libdconf.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libostree-1.so.1 \
libseccomp.so.2 \
libsystemd.so.0 \
libxml2.so.2 \
libzstd.so.1"

inherit rpm
