SUMMARY = "Qt 6 Test library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Test6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "608758ad2fab97066b3f1c1e4bd634707de6ffae0f2fc64cf0663a72d048f3e7cd54409f98c33620b569599ca7f5392683528b7643cbcf3be15973ac1e8ba96d"

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
