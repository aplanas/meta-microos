SUMMARY = "Qt 5 Test Library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Test5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "91c8a2a1e7c4e20adc19647e98a4fce22992bb5f93ac224795783196e1c8c46372b1bca15beda0247967c754707aebe6ee6552f7a692358319d723b0c209601a"

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
