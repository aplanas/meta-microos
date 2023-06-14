SUMMARY = "Interface for MediaWiki based web services"
DESCRIPTION = "libmediawiki is a KDE C++ interface for MediaWiki based web services as \
wikipedia.org. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-or-later"

PV = "5.38.0"

RPM_NAME = "libKF5MediaWiki5-5.38.0-1.3.aarch64.rpm"
RPM_HASH = "31c1c7cb6a1273541eafcf5f96a1d6a3d4aede122060cf6614a812d3b17ee351e1c8a24221b0363c0b8b080215d576122fa67497a90daf6f168f1dd1687d3464"

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
