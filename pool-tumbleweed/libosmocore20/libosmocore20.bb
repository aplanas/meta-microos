SUMMARY = "Osmocom core library"
DESCRIPTION = "libosmocore is a library with various utility functions shared \
between OpenBSC and OsmocomBB."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocore20-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "61edb3a05e0e3aea8649294d45a759b9e13c3203741ce30f07a7183f0db6868cbba5015c4111b9319d127ddfbbc7fc5f360c14e4a72835075570a1ad2b9c934f"

RPROVIDES:${PN} += "libosmocore.so.20 \
libosmocore20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libsctp.so.1 \
libtalloc.so.2"

inherit rpm
