SUMMARY = "Qt 5 XmlPatterns Library"
DESCRIPTION = "The Qt XML Patterns module provides support for XPath, XQuery, XSLT, \
and XML Schema validation."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5XmlPatterns5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "60847f61a7597cb2f62572f3a5edc4702d79f05e4ded7d65f5b49f5fc3c47af5a1c8b390e766e3427d00466a46f9207b6e8b6e83fd6296d17b5d8ad471c5af4d"

RPROVIDES:${PN} += "libQt5XmlPatterns.so.5 \
libQt5XmlPatterns5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libQt5Network5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
