SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.2.5"

RPM_NAME = "libags5-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "72c0c0948690bfe5976c31f78e850fac16792b541d17159cad84162fbf889c4039be3a1a1a3647731bc33e99ee7489bf3b500db9c019bfa00362d78e58731541"

RPROVIDES:${PN} += "libags.so.5()(64bit) \
libags5 \
libags5(aarch-64) \
libags_audio.so.5()(64bit) \
libags_gui.so.5()(64bit) \
libags_server.so.5()(64bit) \
libags_thread.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcrypt.so.1()(64bit) \
libfftw3.so.3()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libinstpatch-1.0.so.2()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsamplerate.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libsoup-3.0.so.0()(64bit) \
libuuid.so.1()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
