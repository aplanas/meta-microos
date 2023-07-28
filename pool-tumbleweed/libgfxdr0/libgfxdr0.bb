SUMMARY = "GlusterFS's External Data Representation library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfxdr0-11.0-4.1.aarch64.rpm"
RPM_HASH = "519557756b603bb8f8f414d10fe89ce0adcff111e72abdf3cb62f54496e087c57a95fefcb4a1b983b01550b22241816f1672b0b550c79345d073cf02d9e25f72"

RPROVIDES:${PN} += "libgfxdr.so.0 \
libgfxdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtirpc.so.3"

inherit rpm
