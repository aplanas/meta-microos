SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libsss_idmap0-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "908fdc496c022134fd4170bc9d795e0e549a0eccd029afb8087bd912fd3875b0ea804b2576807e33f0d5bcfb977468ac9221068b68685c244706fb987be5e389"

RPROVIDES:${PN} += "libsss_idmap.so.0()(64bit) \
libsss_idmap.so.0(SSS_IDMAP_0.4)(64bit) \
libsss_idmap.so.0(SSS_IDMAP_0.5)(64bit) \
libsss_idmap0 \
libsss_idmap0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
