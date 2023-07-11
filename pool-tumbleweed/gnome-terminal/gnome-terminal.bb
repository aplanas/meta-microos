SUMMARY = "GNOME Terminal"
DESCRIPTION = "This package provides the GNOME terminal emulator application."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "gnome-terminal-3.48.1-1.2.aarch64.rpm"
RPM_HASH = "31be4518a1f32a7f8bed954daa9899ec53b2b3f530d50d72f7b4ca3dca8c949b75454506beda60012e3a71a8b278178f714759bd930f4f0882ce648757450fd8"

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
