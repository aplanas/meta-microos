SUMMARY = "Qt 6 Test library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Test6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "1430d9da06c459b4c5c515d48c04fe6c2f4fa9dd31609acd7845cd80156b40ec1369c698c56dfb4c8c104ee3fb3b8afbfaf551ce850d1aa1d01382e0dda8e0ca"

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
