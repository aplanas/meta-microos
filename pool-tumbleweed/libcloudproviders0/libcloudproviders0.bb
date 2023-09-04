SUMMARY = "Library to integrate cloud storage providers"
DESCRIPTION = "Cross desktop library for desktop integration of cloud storage \
providers and sync tools."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "libcloudproviders0-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "dec949d4e11a997c14da1e2b8447a53ad51e83206a27372df2afa7b9f4f1fa71ef0e5623e174553144b797b4024d4a5be9e29e0529b17e297d6497ccbd9bc079"

RPROVIDES:${PN} += "libcloudproviders.so.0 \
libcloudproviders0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
