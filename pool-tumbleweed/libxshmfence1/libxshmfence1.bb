SUMMARY = "A tiny library that exposes a event API on top of Linux futexes"
DESCRIPTION = "This is a tiny library that exposes a event API on top of Linux \
futexes. There was some discussion about using eventfd instead of this, \
but the cost of adding two FDs to the X server for every DRI application \
seems excessive, and by using PresentIdleNotify events, to work around \
the limitations of futexes."
LICENSE = "HPND"

PV = "1.3.2"

RPM_NAME = "libxshmfence1-1.3.2-1.2.aarch64.rpm"
RPM_HASH = "8c943d3476fb002b6a1aadccc5a27fe2c074226d7b3f0e0ec2aed4137fd1f10ae5964a2095fa5c8b41ded8b6eaba441d587cf641ec9a1f7cb864799a9f5d9fdd"

RPROVIDES:${PN} += "libxshmfence.so.1()(64bit) \
libxshmfence1 \
libxshmfence1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.27)(64bit)"

inherit rpm
