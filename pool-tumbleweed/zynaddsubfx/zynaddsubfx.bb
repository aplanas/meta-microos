SUMMARY = "A Real-Time Software Synthesizer for Linux"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-3.0.6-3.1.aarch64.rpm"
RPM_HASH = "d9db8a5cca6fff2931aaa58a22bd82ab5a29f44e61b4ba80bd6630df1a48cd5020a161d6358c838cc6ca47c1c3d75ffdbe4fe5d10673fcdea47dee61b6c3df2f"

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
