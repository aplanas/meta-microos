SUMMARY = "Development files for the Qt5 XML Patterns library"
DESCRIPTION = "You need this package if you want to compile programs with QtXmlPatterns."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "49a4c6e2225d948af583016a951ec65bb28570a1762ec8558ea3281b45dadb5bc2f7bdb66114d7a395fabb7bf6431dc5a45c1ff4e529c0ae579e2e31757221c2"

RPROVIDES:${PN} += "cmake-Qt5XmlPatterns \
libQt5XmlPatterns-devel \
libqt5-qtxmlpatterns-devel \
pkgconfig-Qt5XmlPatterns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5XmlPatterns5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
