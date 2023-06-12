SUMMARY = "Reusable cluster libraries"
DESCRIPTION = "A collection of libraries that are useful for writing cluster managers \
such as Pacemaker."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.0.12+v1.git.1663933145.1619d044"

RPM_NAME = "cluster-glue-libs-1.0.12+v1.git.1663933145.1619d044-1.4.aarch64.rpm"
RPM_HASH = "7a7972706b2b3636e8783d45b2bd0e470e17d5841304ed7232676f9473838c4e4de36c64bf432acdbdd387ca30fad079581b6f62a134f657f605fa177dce7906"

RPROVIDES:${PN} += "cluster-glue-libs \
cluster-glue-libs(aarch-64) \
libglue2 \
libpils.so.2()(64bit) \
libplumb.so.2()(64bit) \
libplumbgpl.so.2()(64bit) \
libstonith.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
cluster-glue \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libglib-2.0.so.0()(64bit) \
libltdl.so.7()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
