SUMMARY = "Convenience library for clients of NetworkManager"
DESCRIPTION = "This package contains the libraries that make it easier to use some \
Network Manager functionality from applications that use glib."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "libnm0-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "b613d938aa27136d06c47f71505e04fa75ea5a50e3cc2b592649ea4f83510efe462d29f6d75c628ee953101c392010647cc2ace54cfcf4d4e0d0e4b0d5c37964"

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
