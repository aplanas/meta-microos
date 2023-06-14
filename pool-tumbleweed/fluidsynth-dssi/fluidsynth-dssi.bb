SUMMARY = "Fluidsynth Plug-In for Disposable Soft Synth Interface"
DESCRIPTION = "FluidSynth-DSSI is the plug-in implementation of fluidsynth on DSSI \
(Disposable Soft Synth Interface) with a GTK+ GUI."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.9+git13012019"

RPM_NAME = "fluidsynth-dssi-1.9.9+git13012019-1.20.aarch64.rpm"
RPM_HASH = "58e538f5cb5997529c8d3cd044bca08b70d010a2e80479a30e59ed5c9175fd8c0602909582095859998a3f15c51a84fb4cf1512a95b312371157fe14a91b7555"

RPROVIDES:${PN} += "fluidsynth-dssi"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfluidsynth.so.3 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblo.so.7 \
libm.so.6"

inherit rpm
