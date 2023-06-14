SUMMARY = "Tools to manipulate LDB files"
DESCRIPTION = "Tools to manipulate LDB files."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "ldb-tools-2.7.2-1.1.aarch64.rpm"
RPM_HASH = "6e9f865de25baeee4caa142c4140eef3a0f69d35f33dd8ac7d04860a6ecb699eb38ce5f507f331b86151dc1220efe9369051e4ab3a9337f3486f129ebcbb22a6"

RPROVIDES:${PN} += "ldb-tools \
libldb-cmdline.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldb.so.2 \
libpopt.so.0 \
libtalloc.so.2"

inherit rpm
