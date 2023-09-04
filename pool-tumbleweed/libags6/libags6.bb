SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.1"

RPM_NAME = "libags6-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "4f828f7e15ba150b57e7802c55af38bc1b01bfc50aee189e17fc080029348da5c60b2bac1d36e25c46a1eb0e1ab07ce1d384f6648057b2a24ee4f7578054ac46"

RPROVIDES:${PN} += "libags-audio.so.6 \
libags-gui.so.6 \
libags-server.so.6 \
libags-thread.so.6 \
libags.so.6 \
libags6"

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
libsndfile.so.1 \
libsoup-3.0.so.0 \
libuuid.so.1 \
libxml2.so.2"

inherit rpm
