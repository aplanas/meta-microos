SUMMARY = "Libraries for stoken"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package contains stoken libraries."
LICENSE = "LGPL-2.0-or-later & BSD-3-Clause"

PV = "0.92"

RPM_NAME = "libstoken1-0.92-1.21.aarch64.rpm"
RPM_HASH = "fd66c1de523921163a96702b0167b1011af1b1cbabfdd9de45988becb93866feee399ae0870e0bcdb79d927e568a860d8d80a8c4d48220b666a3a38f5e622650"

RPROVIDES:${PN} += "libstoken.so.1()(64bit) \
libstoken.so.1(STOKEN_1.0)(64bit) \
libstoken.so.1(STOKEN_1.1)(64bit) \
libstoken.so.1(STOKEN_1.2)(64bit) \
libstoken.so.1(STOKEN_1.3)(64bit) \
libstoken.so.1(STOKEN_PRIVATE)(64bit) \
libstoken1 \
libstoken1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libtomcrypt.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
