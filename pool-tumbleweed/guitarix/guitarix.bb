SUMMARY = "Simple Linux amplifier for jack"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs. Designed to get nice trash/metal/rock/guitar sounds. \
 \
Available are the controls for bass, treble, gain, balance, \
distortion, freeverb, impulse response (pre state), crybaby(wah), \
feedback/feedforward-filter and echo. A fixed resonator will use, \
when distortion is disabled."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.1"

RPM_NAME = "guitarix-0.44.1-2.2.aarch64.rpm"
RPM_HASH = "3cb07261dd604dff8299bed53719c28d70a00d11c2737efc6cbfbf185d2fcb1cd275efc2a1e50d4e5fb2674574eacad1585d55d215a096c9332812447dfc43e1"

RPROVIDES:${PN} += "application() \
application(guitarix.desktop) \
guitarix \
guitarix(aarch-64) \
metainfo() \
metainfo(org.guitarix.guitarix.metainfo.xml)"

RDEPENDS:${PN} += "(jack or pipewire-libjack-0_3) \
ld-linux-aarch64.so.1()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-gobject.so.0()(64bit) \
libbluetooth.so.3()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libcurl.so.4()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libgxw.so.0()(64bit) \
libgxwmm.so.0()(64bit) \
libjack.so.0()(64bit) \
liblilv-0.so.0()(64bit) \
liblo.so.7()(64bit) \
liblrdf.so.2()(64bit) \
libm.so.6()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libzita-convolver.so.4()(64bit) \
meterbridge \
vorbis-tools"

inherit rpm
