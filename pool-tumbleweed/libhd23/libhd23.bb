SUMMARY = "Hardware detection library"
DESCRIPTION = "This library collects information about the hardware installed on a \
system."
LICENSE = "GPL-2.0-or-later"

PV = "23.1"

RPM_NAME = "libhd23-23.1-1.1.aarch64.rpm"
RPM_HASH = "592bb6763b356f6c4dd48a7b00604428a4d78db6dbac5bed689671e4197f9b6b53826174f9f2a5781a40a403cce15af3d391bc860c0b661830e5a8e6545e653c"

RPROVIDES:${PN} += "libhd \
libhd.so.23 \
libhd23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
