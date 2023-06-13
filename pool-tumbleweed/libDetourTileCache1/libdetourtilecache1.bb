SUMMARY = "Detour Tile Cache Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour tile cache library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libDetourTileCache1-1.5.1+git20210305.c5cbd53-1.7.aarch64.rpm"
RPM_HASH = "ee9f381b8535137591dda3a0e4492282c5de1956eb0ee03c79a50668bc7ffbe93bd596d76d97c86588bda878c661159d5c3f3c238f69514a97fd7170bb493280"

RPROVIDES:${PN} += "libDetourTileCache.so.1()(64bit) \
libDetourTileCache1 \
libDetourTileCache1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libDetour.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
