SUMMARY = "Xsynth an analog-style (VCAs-VCF-VCO) synth plugin"
DESCRIPTION = "The xsynth-dssi  package contains the Xsynth-DSSI plugin, \
a classic-analog (VCOs-VCF-VCA) style software synthesizer \
with an editor GUI. Xsynth-DSSI was written by Sean Bolton, \
and was based on Steve Brooke's Xsynth code, but has since \
aquired polyphonic operation, band-limited oscillators, \
a better filter mode, and velocity-sensitive envelopes. \
 \
Author: \
-------- \
    Sean Bolton <sean@smbolton.com>"
LICENSE = "GPL-2.0-or-later"

PV = "0.9.4"

RPM_NAME = "xsynth-dssi-0.9.4-19.17.aarch64.rpm"
RPM_HASH = "c7566a7a93a0c7e54160799090c62410baf5ffdf8c1efa7630cfdfc5b57b6b4e4ad433569d38c72074211c28ae923968ff2da5ae3977032f08287d2116f515a2"

RPROVIDES:${PN} += "xsynth-dssi"

RDEPENDS:${PN} += "/sbin/ldconfig \
dssi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblo.so.7 \
libm.so.6"

inherit rpm
