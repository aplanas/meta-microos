SUMMARY = "Real-time software synthesizer, DSSI Plugin version"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too. \
 \
This package includes the DSSI zynaddsubfx synthesizer plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-dssi-3.0.6-3.1.aarch64.rpm"
RPM_HASH = "3e55395d511c961a732793235338eaa35596962643b9a8816dcc8fb10fd0a1138b6cca3f71cb699ff505bdd98faab2c55006e56998b1c68ce4baec10ab3b2752"

RPROVIDES:${PN} += "libzynaddsubfx-dssi.so \
zynaddsubfx-dssi"

RDEPENDS:${PN} += "dssi \
ld-linux-aarch64.so.1 \
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
