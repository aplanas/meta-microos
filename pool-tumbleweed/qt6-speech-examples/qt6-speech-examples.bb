SUMMARY = "Examples for the qt6-speech modules"
DESCRIPTION = "Examples for the qt6-speech modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-speech-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "117213d3cc112b945917afc300db8eac65d45c17c6b743103ff005490291daed2d898a2001b9594e2329988ac1d1a3c241e659b97a468780efdaf0f03699529d"

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
