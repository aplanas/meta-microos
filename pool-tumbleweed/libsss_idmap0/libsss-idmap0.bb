SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libsss_idmap0-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "74e646397480389aa801944d3f9ea33aaa15415147f3815f7a720924b316c2b1ef736d46e8e34a42e8750eb3605d698be0d63e46f065634adb63adaee816b330"

RPROVIDES:${PN} += "libsss-idmap.so.0 \
libsss-idmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
