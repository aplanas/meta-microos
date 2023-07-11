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

RPM_NAME = "zynaddsubfx-vst-3.0.6-3.2.aarch64.rpm"
RPM_HASH = "c3efbdd6d05019eb27834efc4fc96250dce29f9c5b2e5a4e372859533f4daf5a09178ab72577166bad93b1c3a6f781924411c3959c806e099ef25dc6d58853e7"

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
