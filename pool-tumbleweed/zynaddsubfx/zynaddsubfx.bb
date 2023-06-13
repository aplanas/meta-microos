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
application() \
application(zynaddsubfx-alsa.desktop) \
application(zynaddsubfx-jack-multi.desktop) \
application(zynaddsubfx-jack.desktop) \
zynaddsubfx \
zynaddsubfx(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libXpm.so.4()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libmxml.so.1()(64bit) \
libntk.so.1()(64bit) \
libntk_images.so.1()(64bit) \
libportaudio.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
zynaddsubfx-common"

inherit rpm
