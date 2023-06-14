SUMMARY = "GNOME Terminal"
DESCRIPTION = "This package provides the GNOME terminal emulator application."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "gnome-terminal-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "a83d1c4992b60c5c80b0fa82923fb5795faa85e361311044f130f0d52f7c19023e80d7b39ae26734118755759af83d2365ba3c5c0a018f1408e9931ac5421002"

RPROVIDES:${PN} += "gnome-terminal"

RDEPENDS:${PN} += "filesystem \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
libvte-2.91.so.0"

inherit rpm
