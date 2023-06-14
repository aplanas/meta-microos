SUMMARY = "RSS/Atom parsing library"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. \
This package contains the base library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Syndication5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "8b0224483d21446535af2329ad21466073c64a719399c8c279ddd37364be934390e44e73256a7d1808343e96622c353d5ea209daeb960efd5d311defc32b5004"

RPROVIDES:${PN} += "libKF5Syndication.so.5 \
libKF5Syndication5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
