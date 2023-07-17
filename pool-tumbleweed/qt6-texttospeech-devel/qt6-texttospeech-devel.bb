SUMMARY = "Qt 6 TextToSpeech library - Development files"
DESCRIPTION = "Development files for the Qt 6 TextToSpeech library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-texttospeech-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "21a364936c3757f0c62e84ef01f95a919742a500b5ad78ca3ada40d9052b5eb2d452fbd6dc745dd21847912eb3d2bac703f519340d066392e592d9f11c92571d"

RPROVIDES:${PN} += "cmake-Qt6QTextToSpeechMockPlugin \
cmake-Qt6QTextToSpeechSpeechdPlugin \
cmake-Qt6TextToSpeech \
pkgconfig-Qt6TextToSpeech \
qt6-texttospeech-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6QmlIntegration \
libQt6TextToSpeech6 \
pkgconfig-Qt6Core"

inherit rpm
