SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "libsss_nss_idmap0-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "c059904a97559d937568124b48b06907aaa0a8296ae43e3c63b4a7244d092f8e55e93e92acf4336381729c27152a22317e20e22029abb98e05705fc60d6de58c"

RPROVIDES:${PN} += "libsss_nss_idmap.so.0()(64bit) \
libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.0.1)(64bit) \
libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.1.0)(64bit) \
libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.2.0)(64bit) \
libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.3.0)(64bit) \
libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.4.0)(64bit) \
libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.5.0)(64bit) \
libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.6.0)(64bit) \
libsss_nss_idmap.so.0(SSS_NSS_IDMAP_0.7.0)(64bit) \
libsss_nss_idmap0 \
libsss_nss_idmap0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
