SUMMARY = "Shared library for NTP client applications"
DESCRIPTION = "This package provides the shared library for ntp clients."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "libntpc1-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "8055d39aba61d03a0624337d6a582a2786f8e2a824bde9cdad6b45786fc793f9094a29752ebd8055d78df3a87866e37c6e6a12e518018e399e817881c9dad54a"

RPROVIDES:${PN} += "libntpc.so.1()(64bit) \
libntpc1 \
libntpc1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbsd.so.0()(64bit) \
libbsd.so.0(LIBBSD_0.0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
