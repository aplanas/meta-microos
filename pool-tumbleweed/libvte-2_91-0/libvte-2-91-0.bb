SUMMARY = "Terminal Emulator Library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "libvte-2_91-0-0.72.1-2.2.aarch64.rpm"
RPM_HASH = "507176260d8efb774007637890f65bc3444aaa54cb778e49cc7001f8391035db001a19961d15eea79f8a3a81c57ebc4e2d71c09071e3caf3ca05e0aa5e9c63b0"

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
