SUMMARY = "Graphical User Interface for fluidsynth"
DESCRIPTION = "Qsynth is a fluidsynth GUI front-end application written in C++ around the Qt5 \
toolkit using Qt Designer."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "qsynth-0.9.10-1.2.aarch64.rpm"
RPM_HASH = "e76cf9443f6bcded40eadd8a2beadd96fe3fe8f3ae906b8fca7988cb5c5c8e4c458061067dcc5519f6f6e7aa467d5df0e0fdd48c43d0f0ca626734a7d39932da"

RPROVIDES:${PN} += "qsynth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
