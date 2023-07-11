SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.4.0"

RPM_NAME = "libags5-5.4.0-1.1.aarch64.rpm"
RPM_HASH = "e83041b0665aba61019c19b0558ff053f20dde48cfe47fc69774f02a2d3e0af586ca4fd5e59c746b724e15f67d10426364b173e271164c3e3e07ca6b9085184f"

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
