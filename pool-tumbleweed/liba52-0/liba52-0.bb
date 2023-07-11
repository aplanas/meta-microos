SUMMARY = "ATSC A/52 stream decoder library"
DESCRIPTION = "liba52 is a library for decoding ATSC A/52 streams. \
Shared library part of a52dec."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5+svn613"

RPM_NAME = "liba52-0-0.7.5+svn613-3.17.aarch64.rpm"
RPM_HASH = "71b7b2bdbcf3f669adb916c7ef16bf9b0e6d4a534cabc3024e869ca36cfcf6c6cd67db72074aa8416856b8a5514bf35588f4167fccaa8a31dc881ced05407179"

RPROVIDES:${PN} += "liba52 \
liba52-0 \
liba52.so.0 \
liba52dec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
