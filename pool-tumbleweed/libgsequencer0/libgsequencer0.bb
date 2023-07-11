SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.4.0"

RPM_NAME = "libgsequencer0-5.4.0-1.1.aarch64.rpm"
RPM_HASH = "9ce565bf66691ed692e73a29af7d76b31049cf73fc8133bf1615093c63e1053af64e2c7d572f919a579194c73280022c5eab9679cc846f8cc2d35005dc810784"

RPROVIDES:${PN} += "libgsequencer.so.0 \
libgsequencer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libags-audio.so.5 \
libags-gui.so.5 \
libags-server.so.5 \
libags-thread.so.5 \
libags.so.5 \
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
