SUMMARY = "GNOME Terminal"
DESCRIPTION = "This package provides the GNOME terminal emulator application."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.2"

RPM_NAME = "gnome-terminal-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "501cfd4b0c8388a046ff564268d05060c19ff8349ce71ec99064ff248cae6af00791c1d0f73b3ad26eeb80aba2c49ff41210b2b83b35c34a53999bfcf7b01139"

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
