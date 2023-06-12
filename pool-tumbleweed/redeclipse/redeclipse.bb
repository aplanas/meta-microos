SUMMARY = "Fast-paced first person ego shooter"
DESCRIPTION = "Red Eclipse 2 is a first-person shooter based on the tesseract engine. \
Parkour gameplay, different game modes, and several mutators to make the game very flexible. \
A map editor is included."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-2.0.0-4.5.aarch64.rpm"
RPM_HASH = "71819342e592235e6d86b6ad2cbfd40a9da8d0cab21c4368aadc05fb15ec16a4a0afb6b4df36ce46a8a9f1635b5a56809d94081b1f41ba8812cd7dfe7685c063"

RPROVIDES:${PN} += "application() \
application(redeclipse.desktop) \
metainfo() \
metainfo(redeclipse.appdata.xml) \
redeclipse \
redeclipse(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libenet.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
redeclipse-data"

inherit rpm
