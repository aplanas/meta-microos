SUMMARY = "A Real-Time Software Synthesizer for Linux"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-3.0.6-3.2.aarch64.rpm"
RPM_HASH = "d46bd2360392ae0bf079d63aa4c221969c879917307d29ebd956d9081d43bbd5c9256e4ba369def40fc013a82ce3d248ecb5fcf3ac821c66839e2875bd6cc056"

RPROVIDES:${PN} += "ZynAddSubFX \
zynaddsubfx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXpm.so.4 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libmxml.so.1 \
libntk-images.so.1 \
libntk.so.1 \
libportaudio.so.2 \
libstdc++.so.6 \
libz.so.1 \
zynaddsubfx-common"

inherit rpm
