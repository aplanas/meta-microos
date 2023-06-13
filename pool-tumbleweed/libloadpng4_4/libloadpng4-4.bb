SUMMARY = "PNG support library for Allegro"
DESCRIPTION = "This library allows to load/save PNG images using standard Allegro image \
handling functions."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libloadpng4_4-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "a29d3faaa7328e8a7fcfc62627292fd5d22e7cc9f68e8f7466e35fbab9733a5b44c77eda485118e118e7ffe3ba1d6155e22743fea4ebfb6116f97f7232fa9a92"

RPROVIDES:${PN} += "libloadpng.so.4.4()(64bit) \
libloadpng4_4 \
libloadpng4_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballeg.so.4.4()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
