SUMMARY = "QtAV development files"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the header development files for building some QtAV \
applications using QtAV headers."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "QtAV-devel-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "310e1160b577cf1791ba05d730470728507835a8ef99d7b56b03fff03921c26b3c9258fdc39e6cb50da69fb9851591985c2880d6d0f4f5f016a1ab21cb910ee1"

RPROVIDES:${PN} += "QtAV-devel"

RDEPENDS:${PN} += "libQt5OpenGL-devel \
libQtAVWidgets1"

inherit rpm
