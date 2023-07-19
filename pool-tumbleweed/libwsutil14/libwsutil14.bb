SUMMARY = "Library for wireshark utilities"
DESCRIPTION = "The libwsutil library provides utility functions for libwireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.7"

RPM_NAME = "libwsutil14-4.0.7-1.1.aarch64.rpm"
RPM_HASH = "558c1c41ea819aaaf6255d169efa50500ebf59cbd1b580db7890fa6bcb3f461a3c84b0fed7411a4dea924b3b439fdd36037db3b8ff4632c3a24a1f7f15eae8c9"

RPROVIDES:${PN} += "libwsutil.so.14 \
libwsutil14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libpcre2-8.so.0"

inherit rpm
