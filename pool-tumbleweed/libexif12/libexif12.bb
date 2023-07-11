SUMMARY = "An EXIF Tag Parsing Library for Digital Cameras"
DESCRIPTION = "This library is used to parse EXIF information from JPEGs created by \
digital cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.24"

RPM_NAME = "libexif12-0.6.24-1.10.aarch64.rpm"
RPM_HASH = "c314726a472c81816e7b5fb7ef0b6445df01302e89ceb0b286c1976e17ffcaf546dacdb5d06966086e7361f7065f685450baf5180f95785be83d89074df20318"

RPROVIDES:${PN} += "libexif \
libexif.so.12 \
libexif12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
