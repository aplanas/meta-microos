SUMMARY = "Terminal Emulator Library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings."
LICENSE = "LGPL-2.0-only"

PV = "0.72.2"

RPM_NAME = "libvte-2_91-0-0.72.2-1.1.aarch64.rpm"
RPM_HASH = "8631aa71ebe901effad547b33dcc841f0fd9a1071673b3a43afa138e9e73bb4a613b4d97010e31002fb3f3c816df9013203290827f6b96f17c5abc3b30cdf09c"

RPROVIDES:${PN} += "config-libvte-2-91-0 \
libvte-2-91-0 \
libvte-2.91-gtk4.so.0 \
libvte-2.91.so.0 \
vte"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libicuuc.so.73 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libz.so.1"

inherit rpm
