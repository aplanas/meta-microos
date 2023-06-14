SUMMARY = "Development files for the Qt5 XML Patterns library"
DESCRIPTION = "You need this package if you want to compile programs with QtXmlPatterns."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "55919bd931e1b6d57915c2f82f73d93e44f05ffdf5cb06034229028b315095b911eb7dc0d09aa6fb09b874c04eb884538a73cc710ac3cb9628d9e94dacc80ebb"

RPROVIDES:${PN} += "cmake-Qt5XmlPatterns \
libQt5XmlPatterns-devel \
libqt5-qtxmlpatterns-devel \
pkgconfig-Qt5XmlPatterns"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5XmlPatterns5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
