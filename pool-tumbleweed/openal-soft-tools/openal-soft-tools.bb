SUMMARY = "OpenAL Soft tools"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains additional tools for OpenAL."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "1.22.2"

RPM_NAME = "openal-soft-tools-1.22.2-1.5.aarch64.rpm"
RPM_HASH = "dcb74ec5aec365b34a6d50a21c8ba6ceb77156c1878199cc5ed4961513ca534a41c7db211d4383a58c27938c4962af2be8e66e61e8e2edc4adbfb110dd209a97"

RPROVIDES:${PN} += "openal-soft-/usr/bin/openal-info \
openal-soft-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
