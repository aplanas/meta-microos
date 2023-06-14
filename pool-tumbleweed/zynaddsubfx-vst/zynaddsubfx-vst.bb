SUMMARY = "Real-time software synthesizer, VST Plugin version"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too. \
 \
This package includes the VST zynaddsubfx synthesizer plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-vst-3.0.6-3.1.aarch64.rpm"
RPM_HASH = "c51d185ae769b098cbcf7578993c0bb365fa5ada6e4d66123bbddaeb9fc9e92fbefb2997ccafbb3d74623d6d5401149c7503e5a9a399a8597702211b1700fd08"

RPROVIDES:${PN} += "zynaddsubfx-vst"

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
