SUMMARY = "RSS/Atom parsing library"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. \
This package contains the base library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Syndication5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "42b146f3e98a02008096d22e4299f69610b4816b8e35d6ac2c1f6bab2eb84c1c5eda70769d6a8606864e81565d3b4c07b887c4b7d0e82cb0cb708b91ac72627a"

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
