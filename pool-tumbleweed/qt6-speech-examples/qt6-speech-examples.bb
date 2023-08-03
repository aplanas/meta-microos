SUMMARY = "Examples for the qt6-speech modules"
DESCRIPTION = "Examples for the qt6-speech modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-speech-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6f8d8ec3714bebd2eb5fd1b64356afaa4aa9f3e3c5154d95c780baffdf6b708d352eb0050db9c1ca370a939d2dff35e489406b90b40d30a195cad52f737e4606"

RPROVIDES:${PN} += "qt6-speech-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
