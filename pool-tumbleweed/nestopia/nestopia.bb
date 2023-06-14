SUMMARY = "Nintendo Entertainment System/Famicom emulator"
DESCRIPTION = "Nestopia is a cycle-accurate NES/Famicom emulator. It has a high compatibility \
rate and support for many peripherals and input devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.52.0"

RPM_NAME = "nestopia-1.52.0-1.3.aarch64.rpm"
RPM_HASH = "c452fd3555577ba6ba7f5b90ceabab5a7cdaa5edfd63e676f9644a0067132a262b51f11c8e16b070b939304dfc2a690cd3cadff2e46a11d6d1d0d28d930d8d14"

RPROVIDES:${PN} += "nestopia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libarchive.so.13 \
libc.so.6 \
libfltk-gl.so.1.3 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
