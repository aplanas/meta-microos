SUMMARY = "Reusable cluster libraries"
DESCRIPTION = "A collection of libraries that are useful for writing cluster managers \
such as Pacemaker."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.0.12+v1.git.1663933145.1619d044"

RPM_NAME = "cluster-glue-libs-1.0.12+v1.git.1663933145.1619d044-1.4.aarch64.rpm"
RPM_HASH = "7a7972706b2b3636e8783d45b2bd0e470e17d5841304ed7232676f9473838c4e4de36c64bf432acdbdd387ca30fad079581b6f62a134f657f605fa177dce7906"

RPROVIDES:${PN} += "cluster-glue-libs \
libglue2 \
libpils.so.2 \
libplumb.so.2 \
libplumbgpl.so.2 \
libstonith.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
cluster-glue \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libltdl.so.7 \
libuuid.so.1"

inherit rpm
