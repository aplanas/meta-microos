SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.8"

RPM_NAME = "libgsequencer0-6.0.8-1.1.aarch64.rpm"
RPM_HASH = "24b5de292a5e3fe9609fd294001cd6b45ef7941b295f73eb7199ab89ace644c90c0ec9ad5e4ec89e0324dfc51f0b1d2e71ce87a40b7e5206e9f5285903b41a6e"

RPROVIDES:${PN} += "libgsequencer.so.0 \
libgsequencer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libags-audio.so.6 \
libags-gui.so.6 \
libags-server.so.6 \
libags-thread.so.6 \
libags.so.6 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libinstpatch-1.0.so.2 \
libjack.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpoppler-glib.so.8 \
libpulse.so.0 \
libxml2.so.2"

inherit rpm
