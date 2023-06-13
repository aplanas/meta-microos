SUMMARY = "Qt 5 XmlPatterns Library"
DESCRIPTION = "The Qt XML Patterns module provides support for XPath, XQuery, XSLT, \
and XML Schema validation."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5XmlPatterns5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "25c726d04ed01a1f86d83cd13313c99d3f10c1360e914d488b1ec348c9094f20cb37799116b18bfc6b628495685f913f880f96780cd2590dc85763f5a6703ade"

RPROVIDES:${PN} += "libQt5XmlPatterns.so.5()(64bit) \
libQt5XmlPatterns.so.5(Qt_5)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.0)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.1)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.10)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.11)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.12)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.13)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.14)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.15)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.2)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.3)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.4)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.5)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.6)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.7)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.8)(64bit) \
libQt5XmlPatterns.so.5(Qt_5.9)(64bit) \
libQt5XmlPatterns5 \
libQt5XmlPatterns5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Network5 \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
