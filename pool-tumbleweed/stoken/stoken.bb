SUMMARY = "Token code generator compatible with RSA SecurID 128-bit (AES) token"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package contains the command line tool for stoken."
LICENSE = "LGPL-2.0-or-later & BSD-3-Clause"

PV = "0.92"

RPM_NAME = "stoken-0.92-1.21.aarch64.rpm"
RPM_HASH = "5365c1a3a869c5316ecf85244bc7512a98e432f5c14bbe3a987efd3f9981e4bc3e6ce31898e14b8e1ee01ff978a40016116f978f9dafd8f62f4194dbe1b4c803"

RPROVIDES:${PN} += "stoken \
stoken(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstoken.so.1()(64bit) \
libstoken.so.1(STOKEN_1.3)(64bit) \
libstoken.so.1(STOKEN_PRIVATE)(64bit)"

inherit rpm
