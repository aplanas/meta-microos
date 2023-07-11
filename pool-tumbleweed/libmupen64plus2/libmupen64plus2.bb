SUMMARY = "Shared Library Interface to the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "Mupen64Plus is a plugin-based N64 emulator which is capable of accurately \
playing many games. It includes four MIPS R4300 CPU emulators, with dynamic \
recompilers for 32-bit x86 and 64-bit amd64 systems.  It supports plugins for \
audio, graphical rendering (RDP), the signal co-processor (RSP), and input. \
 \
This package contains the shared library interface for Mupen64plus frontends."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "libmupen64plus2-2.5.9-2.9.aarch64.rpm"
RPM_HASH = "0465d00825b68393f2bc1840dd4d866f2438a6bac66de5911bcb07bb094e30d178d9c582482a7eb77c9cb0b3cee65679128f465287e0a36de79c5a875c358247"

RPROVIDES:${PN} += "libmupen64plus.so.2 \
libmupen64plus2"

RDEPENDS:${PN} += "/sbin/ldconfig \
dejavu \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
liblirc-client.so.0 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
