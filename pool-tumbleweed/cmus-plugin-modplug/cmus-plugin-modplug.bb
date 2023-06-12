SUMMARY = "Modplug input plugin for the C* Music Player"
DESCRIPTION = "This package provides modplug (tracker) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-modplug-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "6cd790e68020dd645c0508ddc27e7b420d5236196147107864501da5f47df97ebdd4f1a943926ba9c67bf5ccb8dcdee78ff1c20aabd564596b6db5bdc02f7c25"

RPROVIDES:${PN} += "cmus-plugin-modplug \
cmus-plugin-modplug(aarch-64)"
RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmodplug.so.1()(64bit)"

inherit rpm