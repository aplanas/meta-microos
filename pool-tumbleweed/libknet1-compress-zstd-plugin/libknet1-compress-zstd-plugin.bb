SUMMARY = "Provides libknet1 zstd support"
DESCRIPTION = "Provides zstd compression support for libknet1."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-compress-zstd-plugin-1.21-1.10.aarch64.rpm"
RPM_HASH = "4cf513a68af18d48980771909e5766c86f710c2147b5f1f22994a88323e4d3da80cea2e2613bac1fd0119aaa48ee65c37e22acdb400a01a1e602cefeb8f44f07"

RPROVIDES:${PN} += "libknet1-compress-zstd-plugin \
libknet1-compress-zstd-plugin(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libknet1(aarch-64) \
libzstd.so.1()(64bit)"

inherit rpm
