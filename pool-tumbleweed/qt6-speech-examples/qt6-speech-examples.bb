SUMMARY = "Examples for the qt6-speech modules"
DESCRIPTION = "Examples for the qt6-speech modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-speech-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "286171422a8f1d0beb15d5e84d0dac1ed53decd696069daafad9e854efdd59709c4ab370ad7ca381e048c1c8a7c7943aa72e8d138ee505d9956dce9fbae2be93"

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
