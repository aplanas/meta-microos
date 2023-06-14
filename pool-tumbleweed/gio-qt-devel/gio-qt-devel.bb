SUMMARY = "Development tools for gio-qt"
DESCRIPTION = "The gio-qt-devel package contains the header files and developer \
docs for gio-qt."
LICENSE = "LGPL-3.0-or-later"

PV = "0.0.11"

RPM_NAME = "gio-qt-devel-0.0.11-1.6.aarch64.rpm"
RPM_HASH = "5487d958c924896f697c5373a3a03a7a0ec556b4390d0945730614e969a085bda0a06d1ad4228230464761113318b29fbfbb7b76496813c9c624b9752a7b65b6"

RPROVIDES:${PN} += "gio-qt-devel \
pkgconfig-gio-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgio-qt0 \
pkgconfig-Qt5Core \
pkgconfig-glibmm-2.4"

inherit rpm
