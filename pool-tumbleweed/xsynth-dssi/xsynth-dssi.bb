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

RPROVIDES:${PN} += "xsynth-dssi \
xsynth-dssi(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
dssi \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
