SUMMARY = "Qt 6 Test library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Test6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "09a8fe5125b50f8f9267163ac086cb1ac6275ba8f600f5ed9479d98600932aec60b9ad4c06b5f54c44dfb841d49919cc339f2621d5da909587dc7cc91c5d4a11"

RPROVIDES:${PN} += "libQt6Test.so.6 \
libQt6Test6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
