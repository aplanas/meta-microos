SUMMARY = "SDL2 plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the SDL2 plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-sdl2-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "a051bd5b6a7458881c699c77cc550e3edc0d2f84af0c1151fe6bf3bad6af464d596d73a529e5ccfc799ab2c6f1793a1b0ee474841276674e5ecf6be675578a03"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-sdl2 \
libaudsdl.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
