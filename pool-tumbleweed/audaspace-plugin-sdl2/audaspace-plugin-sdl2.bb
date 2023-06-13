SUMMARY = "SDL2 plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the SDL2 plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-sdl2-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "8585c9b014c58b28711a62e785341e27c0de1dad91a557950b6d074ff321f141a907d2328157f8cb3fa10970d89331d88c62e33d0df2e9db53837e1266d3f82a"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-sdl2 \
audaspace-plugin-sdl2(aarch-64) \
libaudsdl.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libaudaspace.so.1.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
