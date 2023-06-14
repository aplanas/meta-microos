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

RPM_NAME = "zynaddsubfx-lv2-3.0.6-3.1.aarch64.rpm"
RPM_HASH = "ef0c36f3d1e3f9f8d7e222f148f8d9676ef359511c32d726e71cbfddb8d71921f3647d6e507ccc176d80ce72d4114eac16ffb7fbe4b12b5a279021c59d12b13a"

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
