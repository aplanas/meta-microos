SUMMARY = "JACK output plugin for the C* Music Player"
DESCRIPTION = "This package provides JACK output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-jack-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "4a447975ca8b68e66b385595bdd37b738816bf5248ce29b375629ed6c4cdc6a1d06e5657419289abe86b3cd821f4717e772e7e48802ed98e1623484a34387e97"

RPROVIDES:${PN} += "cmus-plugin-jack cmus-plugin-jack(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libjack.so.0()(64bit) libsamplerate.so.0()(64bit) libsamplerate.so.0(libsamplerate.so.0.0)(64bit)"

inherit rpm
