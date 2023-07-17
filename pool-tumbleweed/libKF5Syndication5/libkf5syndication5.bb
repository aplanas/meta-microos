SUMMARY = "RSS/Atom parsing library"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. \
This package contains the base library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Syndication5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "9f267063058abb89c7223ed4390e9c33e41280bcf78ae2f6aa15c291cabd3903f7ae25045fc9cdfbace538896d28566b7d16cccedbbb121ccf174aa16a1fbc43"

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
