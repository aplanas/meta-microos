SUMMARY = "Multiple Arcade Machine Emulator"
DESCRIPTION = "MAME is an emulator designed to recreate the hardware of arcade game \
systems in software on modern personal computers. The source code to \
MAME serves as this hardware documentation. The fact that the \
software is usable serves primarily to validate the accuracy of the \
documentation."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.254"

RPM_NAME = "mame-0.254-1.1.aarch64.rpm"
RPM_HASH = "3b8cba0860cd8061656e20f4d615811668f5e1f3d8b8ae6e5c99677ce4c33cbe3cc1ad215b7bb55688936534697b4e0eca6669014d444f65cff27e6a618a0642"

RPROVIDES:${PN} += "config-mame \
mame"

RDEPENDS:${PN} += "libFLAC.so.12 \
libGL.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libexpat.so.1 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libportaudio.so.2 \
libportmidi.so.2 \
libpugixml.so.1 \
libpulse.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libutf8proc.so.2 \
libz.so.1 \
mame-data"

inherit rpm
