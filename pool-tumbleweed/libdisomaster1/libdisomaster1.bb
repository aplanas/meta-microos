SUMMARY = "Disomaster Libraries"
DESCRIPTION = "A libisoburn wrapper class for Qt. \
 \
The libdisomaster1 package contains the Libraries for \
disomaster movie."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.8"

RPM_NAME = "libdisomaster1-5.0.8-1.3.aarch64.rpm"
RPM_HASH = "9c1a6e203046ef115f59ab14273b5cab0dc4c410ee578dd25c79b0e836fd2add66101eccfa9f7fe85b0aa23a9f5fee04cd34f8aa3ba9c25b381db887bdb280e2"

RPROVIDES:${PN} += "libdisomaster.so.1 \
libdisomaster1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libisoburn.so.1 \
libstdc++.so.6"

inherit rpm
