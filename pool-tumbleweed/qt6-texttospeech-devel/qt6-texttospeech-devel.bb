SUMMARY = "Qt 6 TextToSpeech library - Development files"
DESCRIPTION = "Development files for the Qt 6 TextToSpeech library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-texttospeech-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ddc3b19ab93f2c38dd006cdcc63706ae65da448519f18bb9643993bb1173f6a1c866b0740a89264b05d16e38ad30e4bb97dd5de778102435b912e03367fb3bd3"

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
