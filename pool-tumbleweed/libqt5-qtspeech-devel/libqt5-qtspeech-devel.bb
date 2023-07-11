SUMMARY = "Development files for the Qt5 Speech library"
DESCRIPTION = "You need this package if you want to compile programs with qtspeech."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde1"

RPM_NAME = "libqt5-qtspeech-devel-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "6535441773bca45644bddf81118c23f84e9b27d64f1fd562d2e7c4d480934fec82ac6f34c7a829c93f9f2c1ee5baf0c2840676bdeeb57fad880d453e7248ca27"

RPROVIDES:${PN} += "cmake-Qt5TextToSpeech \
libqt5-qtspeech-devel \
pkgconfig-Qt5TextToSpeech"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5TextToSpeech5 \
pkgconfig-Qt5Core"

inherit rpm
