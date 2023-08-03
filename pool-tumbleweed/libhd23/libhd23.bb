SUMMARY = "Hardware detection library"
DESCRIPTION = "This library collects information about the hardware installed on a \
system."
LICENSE = "GPL-2.0-or-later"

PV = "23.2"

RPM_NAME = "libhd23-23.2-1.1.aarch64.rpm"
RPM_HASH = "58bd5bb07e26300532e2cb96d21f9172238452d5e0d193c226ef9692aa94db0ff4f7d65ec4b0106c013628d05526d78ba4545d586a8442b687b32491bb2f59fc"

RPROVIDES:${PN} += "libhd \
libhd.so.23 \
libhd23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
