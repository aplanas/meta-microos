SUMMARY = "C++ interface for pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.46.3"

RPM_NAME = "libpangomm-1_4-1-2.46.3-2.4.aarch64.rpm"
RPM_HASH = "b1c588025a54a3cdce50e009a722947edc3a308759bb9451541f3818e9e72c347db6d99490127a1f5ccc55bc133d6bc5edbcb6cecb4ebabc674232e4ceee4b64"

RPROVIDES:${PN} += "libpangomm-1-4-1 \
libpangomm-1.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
