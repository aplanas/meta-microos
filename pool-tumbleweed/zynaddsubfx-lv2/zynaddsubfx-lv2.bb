SUMMARY = "Real-time software synthesizer, LV2 Plugin version"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too. \
 \
This package includes the LV2 zynaddsubfx synthesizer plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-lv2-3.0.6-3.2.aarch64.rpm"
RPM_HASH = "ed40e48a55a910810e7835415cfd2bc2c0f05800fa22f641566d3b3b1c04272a5aaeb985114b91e08b9fb03d2fbd7603df55b8e2a3fac9a1dab5413723f7ec43"

RPROVIDES:${PN} += "zynaddsubfx-lv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
liblo.so.7 \
libm.so.6 \
libmxml.so.1 \
libstdc++.so.6 \
libz.so.1 \
zynaddsubfx-common"

inherit rpm
