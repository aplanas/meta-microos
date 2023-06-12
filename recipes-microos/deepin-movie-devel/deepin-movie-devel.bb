SUMMARY = "Development tools for deepin movie"
DESCRIPTION = "The deepin-movie-devel package contains the header files and developer docs for \
deepin movie."
LICENSE = "GPL-3.0-or-later & OpenSSL"

PV = "5.10.8"

RPM_NAME = "deepin-movie-devel-5.10.8-1.5.aarch64.rpm"
RPM_HASH = "11de092cd28f88bf0ec3f58248623adcf9f8afff54be4b4c8931517c421e5885b759cab2d033cb5078405d4a50b7fe52d19dd3cd32f489d8de45eccef2d9d29c"

RPROVIDES:${PN} += "deepin-movie-devel \
deepin-movie-devel(aarch-64) \
pkgconfig(libdmr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmr0_1 \
pkgconfig(Qt5Concurrent) \
pkgconfig(Qt5Network) \
pkgconfig(Qt5Widgets) \
pkgconfig(Qt5X11Extras) \
pkgconfig(dtkcore) \
pkgconfig(dtkwidget) \
pkgconfig(gl)"

inherit rpm
