SUMMARY = "The Hangul input library"
DESCRIPTION = "Hangul input library used by scim-hangul and ibus-hangul"
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1~git20180606.42f7640"

RPM_NAME = "libhangul1-0.1.1~git20180606.42f7640-1.15.aarch64.rpm"
RPM_HASH = "303e4c9d998c5c48707525bab31f8b6b2881b925988ae746b908811194c286170644e293530b925477c9a1dc421a3e57c7ebb4083d215d7472a6cd58bb16de58"

RPROVIDES:${PN} += "libhangul.so.1()(64bit) \
libhangul1 \
libhangul1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit)"

inherit rpm
