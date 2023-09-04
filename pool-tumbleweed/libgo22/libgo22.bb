SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "13.2.1+git7683"

RPM_NAME = "libgo22-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "658fe1e83ceafc4c3ce55b577abaad19303f554481630d15633463f8aaf7ed39f717eedd1b61829b64254380e1caa499343f886d639f2568ad47d2186d27b48f"

RPROVIDES:${PN} += "libgo.so.22 \
libgo22"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
