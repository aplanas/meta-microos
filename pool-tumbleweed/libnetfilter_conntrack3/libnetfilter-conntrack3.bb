SUMMARY = "Userspace library for the in-kernel connection tracking state table"
DESCRIPTION = "libnetfilter_conntrack is a userspace library providing a programming \
interface (API) to the in-kernel connection tracking state table. The \
library libnetfilter_conntrack has been previously known as \
libnfnetlink_conntrack and libctnetlink. This library is currently \
used by conntrack-tools among many other applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.9"

RPM_NAME = "libnetfilter_conntrack3-1.0.9-1.6.aarch64.rpm"
RPM_HASH = "22705cfdfbb7fa0bf49b2d126b1d53effebbd61471feb86c675f379c9d8f4450d79587e9398a46f7548d666ca1af6db33078b9340caedca648e9430aa8003eed"

RPROVIDES:${PN} += "libnetfilter_conntrack.so.3()(64bit) \
libnetfilter_conntrack3 \
libnetfilter_conntrack3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit) \
libmnl.so.0(LIBMNL_1.1)(64bit) \
libnfnetlink.so.0()(64bit) \
libnfnetlink.so.0(NFNETLINK_1.0.1)(64bit)"

inherit rpm
