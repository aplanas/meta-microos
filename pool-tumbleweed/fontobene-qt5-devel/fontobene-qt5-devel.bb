SUMMARY = "FontoBene parser for Qt5 (header-only)"
DESCRIPTION = "A header-only library to parse FontoBene stroke fonts with C++/Qt5."
LICENSE = "Apache-2.0 | MIT"

PV = "0.2.0"

RPM_NAME = "fontobene-qt5-devel-0.2.0-1.8.aarch64.rpm"
RPM_HASH = "7d212662752fbf60c8d1491338b9ef8a8276cc4875b4d5852d681612e7dd96f1c98dbc42f2a0bc56d0e53976507a3dabe2f01a66f6b4455935111cc101cc2d38"

RPROVIDES:${PN} += "fontobene-qt5-devel \
pkgconfig-fontobene-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-Qt5Core"

inherit rpm
