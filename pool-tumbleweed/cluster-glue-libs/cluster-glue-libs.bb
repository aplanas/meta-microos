SUMMARY = "Reusable cluster libraries"
DESCRIPTION = "A collection of libraries that are useful for writing cluster managers \
such as Pacemaker."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.0.12+v1.git.1663933145.1619d044"

RPM_NAME = "cluster-glue-libs-1.0.12+v1.git.1663933145.1619d044-1.5.aarch64.rpm"
RPM_HASH = "efe671434ce1634403a996c76d459dc6a371dd41950ef0e6dd66ed178f62e24dd36e38ddad933ae620e81cded6ee6c7ec163e027637da2ec25efce1dbebd8265"

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
