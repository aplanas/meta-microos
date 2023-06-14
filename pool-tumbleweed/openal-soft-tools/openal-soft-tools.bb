SUMMARY = "OpenAL Soft tools"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains additional tools for OpenAL."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "1.22.2"

RPM_NAME = "openal-soft-tools-1.22.2-1.4.aarch64.rpm"
RPM_HASH = "64646225976bd55731cee47dfb3c4c36f6ea2daeeb4acc7d557dfc330c3d8e41abc90daf5a01ba37521e7711709523c0b44d782b410e1692be6f18753f5b56eb"

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
