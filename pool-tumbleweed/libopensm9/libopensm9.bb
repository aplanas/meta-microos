SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libopensm9-3.3.24-3.7.aarch64.rpm"
RPM_HASH = "d5850cd49db7e27572620ddd7ade5638aa42984e42e28a1ce1404d1bd03836c5f43496b888c695fa73f61e445ec9e7aaeb928d3c346fefbede4d1e5fef4c417b"

RPROVIDES:${PN} += "libopensm.so.9 \
libopensm9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmcomp.so.5"

inherit rpm
