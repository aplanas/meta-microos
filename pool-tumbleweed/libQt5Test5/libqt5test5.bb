SUMMARY = "Qt 5 Test Library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Test5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "113fdf4e8fe0ee6bf9b5fed746cf0c09f1c3606a49a1c904bc6b4dc9263ff2b26e7b0db701a0e34cc9e4e3ac878f1f126baea17c3811ee65997c099dc8d8f65d"

RPROVIDES:${PN} += "libQt5Test.so.5 \
libQt5Test5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
