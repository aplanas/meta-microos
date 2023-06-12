SUMMARY = "The core library for lightmediascanner"
DESCRIPTION = "Lightweight media scanner. \
 \
This package contains the shared library."
LICENSE = "LGPL-2.1"

PV = "0.5.2"

RPM_NAME = "liblightmediascanner0-0.5.2-2.4.aarch64.rpm"
RPM_HASH = "62ee52e68d304a972ac0192592b122b9b751db5e1295e37e69d7c8dfac45e686291bea3e8930b794f084e3a87ea12c5adb99d53858209f8b15019a98023dc0fb"

RPROVIDES:${PN} += "liblightmediascanner.so.0()(64bit) \
liblightmediascanner0 \
liblightmediascanner0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmagic.so.1()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
