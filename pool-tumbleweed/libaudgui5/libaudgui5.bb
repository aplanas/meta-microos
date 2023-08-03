SUMMARY = "GTK GUI implementation of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "libaudgui5-4.3.1-2.1.aarch64.rpm"
RPM_HASH = "b3cf00f7277b965cf048e29a04d984e7340964cd8b96c0c14225282a727888e9db8fa8c8cbc6f92df08d0a53b93af470bc1d4a68390a87d9b8cd0aaf769c937e"

RPROVIDES:${PN} += "libaudgui.so.5 \
libaudgui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudcore.so.5 \
libaudcore5 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
