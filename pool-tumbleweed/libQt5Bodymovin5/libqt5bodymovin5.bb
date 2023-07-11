SUMMARY = "Qt 5 BodyMovin Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package includes a library for reading BodyMovin animation files."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Bodymovin5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "6c787102dd3fc5adea1860a1bb0da6972afbb473aab8a17fdbd81909013b4fc9eadfb3b11fb48cce105640eab9fb395f66c5a26337a7555f7dd839324624552b"

RPROVIDES:${PN} += "libQt5Bodymovin.so.5 \
libQt5Bodymovin5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
