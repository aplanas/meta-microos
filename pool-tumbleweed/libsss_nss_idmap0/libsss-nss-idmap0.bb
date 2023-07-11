SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libsss_nss_idmap0-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "73cf239fc2f059932085bbe60a793e030eb9d1c13f5ef0aca845855183698aec19da979d12a924b1cccfdf4d1af1aaa1aa1eb3c530e024a350bc5f751dc7eb09"

RPROVIDES:${PN} += "libsss-nss-idmap.so.0 \
libsss-nss-idmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
