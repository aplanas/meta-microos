SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "78d78d86ab835561f479ee55fecd1a5c46766bb95421b4fd27cc6aaeb803d94d58343e1b1d6cccea7a0a74913730ca9cbc7e737b54b38bde85bfda0caecd9d39"

RPROVIDES:${PN} += "libwx-baseu-suse.so.3.0.5 \
libwx-baseu-suse3-0-5 \
wxWidgets"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
