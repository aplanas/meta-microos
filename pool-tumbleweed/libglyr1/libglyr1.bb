SUMMARY = "Search engine for music related metadata"
DESCRIPTION = "The Glyr shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libglyr1-1.0.10-3.9.aarch64.rpm"
RPM_HASH = "1c4f4878fb9ca25203843f846150ec44f524dd0dd62138fe99f7f42c2066c363bfb2b2d1bc1edf7b3df15f410dc7fed7ea90769920e6968c0f4381ea0dbe590e"

RPROVIDES:${PN} += "libglyr.so.1()(64bit) \
libglyr1 \
libglyr1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
