SUMMARY = "DOOM 3 source port"
DESCRIPTION = "dhewm3 is a DOOM 3 GPL source port. \
Unlike the original DOOM 3, dhewm3 uses: \
 \
- SDL for low level OS support, OpenGL and input handling \
- OpenAL for audio output, all OS specific audio backends are gone \
- OpenAL EFX for EAX reverb effects \
- Better support for widescreen (and arbitrary display resolutions)"
LICENSE = "GPL-3.0-only"

PV = "1.5.2"

RPM_NAME = "dhewm3-1.5.2-1.6.aarch64.rpm"
RPM_HASH = "6638134fd867caebe0ec93b548599b33e954a41c02eb2d98ce12ebb44c31b85158204428b43c2c7e13cf8f8f7eaceb880c4730d965807476d65516eb81653f68"

RPROVIDES:${PN} += "dhewm3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
