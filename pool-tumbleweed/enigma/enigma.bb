SUMMARY = "An Excellent Oxyd Clone"
DESCRIPTION = "Enigma is similar to the well known game Oxyd."
LICENSE = "GPL-2.0-or-later"

PV = "1.30"

RPM_NAME = "enigma-1.30-1.10.aarch64.rpm"
RPM_HASH = "2693f09279d5fd64ac70dd71257ca99019c352a1c1a8087f9119789b211dbb4e2c8af108dc4a4b1cdf0fb2b0e71c57e0d4902783a7893d34682a7c6753a89284"

RPROVIDES:${PN} += "application() \
application(enigma-help.desktop) \
application(enigma.desktop) \
enigma \
enigma(aarch-64) \
metainfo() \
metainfo(enigma.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libenet.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxerces-c-3.2.so()(64bit) \
libz.so.1()(64bit)"

inherit rpm
