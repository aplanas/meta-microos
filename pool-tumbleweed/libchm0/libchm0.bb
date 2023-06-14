SUMMARY = "A library for dealing with ITSS/CHM files"
DESCRIPTION = "CHMLIB is a library for dealing with Microsoft ITSS/CHM format files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "libchm0-0.40-24.8.aarch64.rpm"
RPM_HASH = "191e891e1e415392f387703cbab5bbe53383a26c7e4e8f397fd063009ba7c35e447eabb7d0d826515d26820a4e13fb2ca6190eba274d8743bcc7f28c1b246bed"

RPROVIDES:${PN} += "chmlib \
libchm.so.0 \
libchm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
