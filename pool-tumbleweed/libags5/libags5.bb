SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.2.5"

RPM_NAME = "libags5-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "72c0c0948690bfe5976c31f78e850fac16792b541d17159cad84162fbf889c4039be3a1a1a3647731bc33e99ee7489bf3b500db9c019bfa00362d78e58731541"

RPROVIDES:${PN} += "libags-audio.so.5 \
libags-gui.so.5 \
libags-server.so.5 \
libags-thread.so.5 \
libags.so.5 \
libags5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcrypt.so.1 \
libfftw3.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libinstpatch-1.0.so.2 \
libjack.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libsoup-3.0.so.0 \
libuuid.so.1 \
libxml2.so.2"

inherit rpm
