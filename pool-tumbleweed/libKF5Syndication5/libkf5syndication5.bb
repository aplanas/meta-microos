SUMMARY = "RSS/Atom parsing library"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. \
This package contains the base library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Syndication5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "35cae6e21bc526d02bf0238545168a01a5b0fa0ff7bca815de53d6a98277a28fc3378752d784887ec4c614bb820457345826f7dde1cb6d83a2c3307a21fe4f92"

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
