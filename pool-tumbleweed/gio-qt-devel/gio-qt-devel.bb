SUMMARY = "Development tools for gio-qt"
DESCRIPTION = "The gio-qt-devel package contains the header files and developer \
docs for gio-qt."
LICENSE = "LGPL-3.0-or-later"

PV = "0.0.11"

RPM_NAME = "gio-qt-devel-0.0.11-1.7.aarch64.rpm"
RPM_HASH = "30aa3cce0f4ce9cb47948008c0a34d5fec94950d7dbfb2628439b742e3d484e6f915889e0d00a22d3525a6dbcbb813f4516fded4d1eff85be976990d1bc8608f"

RPROVIDES:${PN} += "gio-qt-devel \
pkgconfig-gio-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgio-qt0 \
pkgconfig-Qt5Core \
pkgconfig-glibmm-2.4"

inherit rpm
