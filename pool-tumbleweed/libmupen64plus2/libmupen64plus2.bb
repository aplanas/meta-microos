SUMMARY = "Shared Library Interface to the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "Mupen64Plus is a plugin-based N64 emulator which is capable of accurately \
playing many games. It includes four MIPS R4300 CPU emulators, with dynamic \
recompilers for 32-bit x86 and 64-bit amd64 systems.  It supports plugins for \
audio, graphical rendering (RDP), the signal co-processor (RSP), and input. \
 \
This package contains the shared library interface for Mupen64plus frontends."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "libmupen64plus2-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "548150ad210c3cd249cda6bf6ec0b46c8ebbf892c8e581d757851f96de129ce891c6c29d29ddac5e624acc08347b392372794dd879035372171a094db1ad56e5"

RPROVIDES:${PN} += "libmupen64plus.so.2()(64bit) \
libmupen64plus2 \
libmupen64plus2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
dejavu \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
liblirc_client.so.0()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
