SUMMARY = "First-person shooter with cooperative in-game map editing"
DESCRIPTION = "Tesseract is a first-person shooter game focused on instagib deathmatch \
and capture-the-flag gameplay as well as cooperative in-game map editing. \
 \
Tesseract is based on Cube2/Sauerbraten. New rendering features include fully \
dynamic omnidirectional shadows, global illumination, HDR lighting, deferred \
shading and morphological/temporal/multisample anti-aliasing."
LICENSE = "Zlib"

PV = "2018_02_01"

RPM_NAME = "tesseract-2018_02_01-3.11.aarch64.rpm"
RPM_HASH = "19a629b7626d7da7dbf17d8ba75fdd9f7f994e45f6c02d54b6316ed778ada01d3fcc12a2333e3c0f105a7d0bc93fbf7fa217a81a0ecdbbc4b867815b5261683d"

RPROVIDES:${PN} += "application() \
application(tesseract.desktop) \
tesseract \
tesseract(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
tesseract-data"

inherit rpm
