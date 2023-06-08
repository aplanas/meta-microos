SUMMARY = "JACK output plugin for the C* Music Player"
DESCRIPTION = "This package provides JACK output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-jack-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "ede313d9413902cdeacd745cc5e1f1a3404232214fa884ced85ab3004e7cf83c0da14a5f5d27e3f205be73fff4fc495fd6953fb44734c5b26e7ceaac0cc6a4d3"

RPROVIDES:${PN} += "cmus-plugin-jack cmus-plugin-jack(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libjack.so.0()(64bit) libsamplerate.so.0()(64bit) libsamplerate.so.0(libsamplerate.so.0.0)(64bit)"

inherit rpm
