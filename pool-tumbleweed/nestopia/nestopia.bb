SUMMARY = "Nintendo Entertainment System/Famicom emulator"
DESCRIPTION = "Nestopia is a cycle-accurate NES/Famicom emulator. It has a high compatibility \
rate and support for many peripherals and input devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.52.0"

RPM_NAME = "nestopia-1.52.0-1.4.aarch64.rpm"
RPM_HASH = "4e26a8daebdb248118e7c25fe16dc77506d095522de036fcdf72af2355f8fd16fec37d929bf5f3cde553ee1e978674b7d3be31ff189e7bb6c2b8435cdb0277b1"

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
