SUMMARY = "Library to read and write DXF files"
DESCRIPTION = "libdxfrw is a free C++ library to read and write DXF files in both formats, \
ascii and binary form."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0~rc1+git.20220905"

RPM_NAME = "libdxfrw1-1.1.0~rc1+git.20220905-1.3.aarch64.rpm"
RPM_HASH = "81b90a348ba9faf9d28757d7c3660a355a6dbed4804b8a3705f7c6d929e734460874ec31ec5bb34af328983882be2d55c495f02c5ac0f3790e1aa22312b097f2"

RPROVIDES:${PN} += "libdxfrw.so.1()(64bit) \
libdxfrw1 \
libdxfrw1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
