SUMMARY = "MP3 encoding tool"
DESCRIPTION = "Shine is an MP3 encoding library implemented in fixed-point \
arithmetic. This package contains the shineenc command line encoder."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "shine-3.1.1-1.6.aarch64.rpm"
RPM_HASH = "a2ae4fa7432beb0d0044e70dd61245fe6b993819e14addfd4d84304c5c92e440a3f7fefacd455b3346e3514cac0a9488f74d2b2595cc24267f871d55ccb5070f"

RPROVIDES:${PN} += "shine \
shine(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libshine.so.3()(64bit)"

inherit rpm
