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

RPM_NAME = "zynaddsubfx-dssi-3.0.6-3.2.aarch64.rpm"
RPM_HASH = "0be271a715b37c605b0b16d8df613a40fe4823d4a5ac93d4225847ad325f6b86184aa0b2ecf154e94ac06c48f071505f49ed1463b85a616be21934089cfc9de5"

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
