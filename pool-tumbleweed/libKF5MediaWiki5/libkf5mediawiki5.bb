SUMMARY = "Interface for MediaWiki based web services"
DESCRIPTION = "libmediawiki is a KDE C++ interface for MediaWiki based web services as \
wikipedia.org. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-or-later"

PV = "5.38.0"

RPM_NAME = "libKF5MediaWiki5-5.38.0-1.4.aarch64.rpm"
RPM_HASH = "26ff364405d887220109938d5ae41f542b93e32105052e3e494d17cb28e89fb5fd597c63f8a9c2b978eaebda97612db3d3c771199cbb1d1e1f099ba79fc3f345"

RPROVIDES:${PN} += "libKF5MediaWiki.so.5 \
libKF5MediaWiki5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
