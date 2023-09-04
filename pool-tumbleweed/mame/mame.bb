SUMMARY = "Multiple Arcade Machine Emulator"
DESCRIPTION = "MAME is an emulator designed to recreate the hardware of arcade game \
systems in software on modern personal computers. The source code to \
MAME serves as this hardware documentation. The fact that the \
software is usable serves primarily to validate the accuracy of the \
documentation."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.257"

RPM_NAME = "mame-0.257-1.1.aarch64.rpm"
RPM_HASH = "2b3122a543d6be47c028628094de2cb41340b4e75c232013c2d9743f9ca0b3e609106940316fcea6237e8f25d6b8707b2a0016bf0b7db30a4020f926bd2640f4"

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
