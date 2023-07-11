SUMMARY = "Library for interaction with OAuth-powered network services"
DESCRIPTION = "QOAuth supports interaction with OAuth-powered network services, \
in the style of Qt libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "libqoauth2-2.0.0-3.23.aarch64.rpm"
RPM_HASH = "a911824d245a9a102eed5a651841f3392042fff7955e510ca4f819c1aab88b9e4c6aa6445e0b344faa868c64b72ce915e886194d42be876a1103545d30fd6371"

RPROVIDES:${PN} += "libqoauth.so.2 \
libqoauth2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
