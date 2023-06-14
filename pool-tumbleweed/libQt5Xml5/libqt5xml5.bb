SUMMARY = "Qt 5 Xml Library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Xml5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "5105e4fb440faa21fbee6bc0ed49bd673a87e9361b7e418af0c960640e943554b47ad3588846789036e2ff1487b88358e2ac589aebe4a2fb04cd8aab8eeec609"

RPROVIDES:${PN} += "libQt5Xml.so.5 \
libQt5Xml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
