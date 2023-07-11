SUMMARY = "The Hangul input library"
DESCRIPTION = "Hangul input library used by scim-hangul and ibus-hangul"
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1~git20180606.42f7640"

RPM_NAME = "libhangul1-0.1.1~git20180606.42f7640-1.16.aarch64.rpm"
RPM_HASH = "af46c15f9d9b60fab992704bf8b9514e7a41abcafdedf276dd158cb55b48bc3bd72390573b09abfa5dbff6b20d4b97342d20d2ece942b18b029b96283f3241d7"

RPROVIDES:${PN} += "libhangul.so.1 \
libhangul1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
