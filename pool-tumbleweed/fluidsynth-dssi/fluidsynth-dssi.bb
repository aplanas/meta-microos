SUMMARY = "Fluidsynth Plug-In for Disposable Soft Synth Interface"
DESCRIPTION = "FluidSynth-DSSI is the plug-in implementation of fluidsynth on DSSI \
(Disposable Soft Synth Interface) with a GTK+ GUI."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.9+git13012019"

RPM_NAME = "fluidsynth-dssi-1.9.9+git13012019-1.20.aarch64.rpm"
RPM_HASH = "58e538f5cb5997529c8d3cd044bca08b70d010a2e80479a30e59ed5c9175fd8c0602909582095859998a3f15c51a84fb4cf1512a95b312371157fe14a91b7555"

RPROVIDES:${PN} += "fluidsynth-dssi \
fluidsynth-dssi(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfluidsynth.so.3()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit)"

inherit rpm
