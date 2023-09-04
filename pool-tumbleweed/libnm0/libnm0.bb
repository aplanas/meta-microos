SUMMARY = "Convenience library for clients of NetworkManager"
DESCRIPTION = "This package contains the libraries that make it easier to use some \
Network Manager functionality from applications that use glib."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "libnm0-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "d0dba7919afab4f6b87263cbf609e92a97bebdf3af40fc1000ffd7ca7431e0bd8caf28ac6c8f3e2135c96b7d3e6421972022b322c060e66f78a787816595976d"

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
