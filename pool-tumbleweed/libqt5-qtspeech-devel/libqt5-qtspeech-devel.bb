SUMMARY = "Development files for the Qt5 Speech library"
DESCRIPTION = "You need this package if you want to compile programs with qtspeech."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtspeech-devel-5.15.9+kde1-1.2.aarch64.rpm"
RPM_HASH = "23c0693f3d87d92b55dcf840ae624a00bef395df364cc9140ebae884f83418c96226959c3ccfdebfca910f4ea2d13f3239109eab81e27f6d1faa6186bf0b926d"

RPROVIDES:${PN} += "cmake-Qt5TextToSpeech \
libqt5-qtspeech-devel \
pkgconfig-Qt5TextToSpeech"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5TextToSpeech5 \
pkgconfig-Qt5Core"

inherit rpm
