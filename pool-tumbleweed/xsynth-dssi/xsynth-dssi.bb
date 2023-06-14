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

RPM_NAME = "xsynth-dssi-0.9.4-19.16.aarch64.rpm"
RPM_HASH = "820d1f735923f9a80668a8b17df1c3089773a810b897962f99f6e359d29821f9d90334aefa4dba0875d1ecad12bb5044c84d9825d538041d91c2f9fd358ecfc4"

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
