SUMMARY = "Library to read and write DXF files"
DESCRIPTION = "libdxfrw is a free C++ library to read and write DXF files in both formats, \
ascii and binary form."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0+git.20221210"

RPM_NAME = "libdxfrw1-2.2.0+git.20221210-1.1.aarch64.rpm"
RPM_HASH = "6afba86ab5d1df059dabb56d7eeb09ad2f886af507333fab9f958d7f1a0cecbc4be60131ec1323c22a1bfca08c91d895e567145351c6824f8511892165cfa418"

RPROVIDES:${PN} += "libdxfrw.so.1 \
libdxfrw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
