SUMMARY = "JPEG support library for Allegro"
DESCRIPTION = "This library allows to load/save JPG images using standard Allegro image \
handling functions."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libjpgalleg4_4-4.4.3.1-1.15.aarch64.rpm"
RPM_HASH = "755e84c149ab0e60b98b51dada224cd262ef00044b3c23517f7eda4d86df3cfebd705c1974fbfe2432f5f6fadeee52e94d801677cfc990c61e14db85f9d19faf"

RPROVIDES:${PN} += "libjpgalleg.so.4.4()(64bit) \
libjpgalleg4_4 \
libjpgalleg4_4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballeg.so.4.4()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm