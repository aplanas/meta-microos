SUMMARY = "Osmocom MS lookup library"
DESCRIPTION = "This shared library contains routines for looking up mobile subscribers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-mslookup0-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "3f6a78a78df8c613d0fd836d40b7acf03265b5cc2f2fe4a73a1afabd09e39ec0a2ec61dec8daa87975ba65dc576195d6c5699c52fc83ae93e370e017577bf3dd"

RPROVIDES:${PN} += "libosmo-mslookup.so.0()(64bit) \
libosmo-mslookup0 \
libosmo-mslookup0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libtalloc.so.2()(64bit)"

inherit rpm
