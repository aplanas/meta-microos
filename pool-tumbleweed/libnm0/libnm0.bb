SUMMARY = "Convenience library for clients of NetworkManager"
DESCRIPTION = "This package contains the libraries that make it easier to use some \
Network Manager functionality from applications that use glib."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "libnm0-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "6fa5023f35e806d080ef914df068bb6c886676caf126818701ea3dfe63533d4bb906a6835e752fee1453694a5ee081624c4b8670f9b77de4ed924fa47808871c"

RPROVIDES:${PN} += "libnm.so.0 \
libnm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libudev.so.1"

inherit rpm
