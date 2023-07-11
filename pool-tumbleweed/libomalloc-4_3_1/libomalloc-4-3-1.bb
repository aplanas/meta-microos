SUMMARY = "The omalloc memory allocator library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libomalloc-4_3_1-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "4545b367836c26be991e115731a2100534e8f8076b36125c8c9bba06cefdc0ce5b4f48ed0db23e00a09164823a84ca6e4a44319bf8c3f6421e4a4cfe6c67a015"

RPROVIDES:${PN} += "libomalloc-4-3-1 \
libomalloc-4.3.1.p3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
