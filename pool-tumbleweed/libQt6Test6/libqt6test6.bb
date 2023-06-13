SUMMARY = "Qt 6 Test library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Test6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8b5ee2e9f36267f50e1a024f1c3e42b8d73fa24e8a9a201bc1d483c48106e77f9fda32edc4abdfd9464c2d1006e65985e067444a83866e01ac8571eb6d4d3bfb"

RPROVIDES:${PN} += "libQt6Test.so.6()(64bit) \
libQt6Test.so.6(Qt_6)(64bit) \
libQt6Test6 \
libQt6Test6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core6 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
