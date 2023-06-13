SUMMARY = "Distributed version control system based on a theory of patches"
DESCRIPTION = "Pijul is a distributed version control system. Its distinctive feature is to be \
based on a theory of patches, which makes it really distributed."
LICENSE = "GPL-2.0-only"

PV = "1.0.0~beta.5"

RPM_NAME = "pijul-1.0.0~beta.5-1.1.aarch64.rpm"
RPM_HASH = "58d078a16a932cd5b9d677297f049aa27440a446dcf5bcec182a3098950ee302b4d45c54f89a115328d403f1a2ae5e4a36d608ff7c3eb12776e188f123a2825f"

RPROVIDES:${PN} += "pijul \
pijul(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
