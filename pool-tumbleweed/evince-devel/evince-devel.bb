SUMMARY = "Header files for the Evince Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript. \
 \
This package contains the header files for building additional plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-devel-44.3-1.1.aarch64.rpm"
RPM_HASH = "594f1231b4b56937031162f5e33d88cd0591446070a0b2e2497e9204e70fe21187dc9625f62cca613ae993d47c7e5633798c5b34e58b0916ba65e6bce51758f3"

RPROVIDES:${PN} += "evince-devel \
pkgconfig-evince-document-3.0 \
pkgconfig-evince-view-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
evince \
libevdocument3-4 \
libevview3-3 \
pkgconfig-gio-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-EvinceDocument-3-0 \
typelib-1-0-EvinceView-3-0"

inherit rpm
