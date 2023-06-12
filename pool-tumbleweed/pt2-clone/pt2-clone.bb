SUMMARY = "ProTracker 2 clone"
DESCRIPTION = "Multi-platform clone of the classic music making software \
ProTracker 2.3D."
LICENSE = "BSD-3-Clause & CC-BY-NC-SA-4.0"

PV = "1.57"

RPM_NAME = "pt2-clone-1.57-1.3.aarch64.rpm"
RPM_HASH = "03748d372a5f92b1ce1305d6c82cc019bee9efc08ec8b6d8bb2507cb3221e035e3b159abfe4d7cb29285f61203e7b99fb166926004e9d96fa555d3f936278d7a"

RPROVIDES:${PN} += "application() \
application(pt2-clone.desktop) \
pt2-clone \
pt2-clone(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm