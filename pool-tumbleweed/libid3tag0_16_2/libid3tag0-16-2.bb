SUMMARY = "ID3 Tag Manipulation Library"
DESCRIPTION = "libid3tag is a library for reading and writing ID3 tags, both ID3v1 and \
the various versions of ID3v2."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "libid3tag0_16_2-0.16.2-1.6.aarch64.rpm"
RPM_HASH = "015d47b472caa3a63cae860d474ec82676a2b16869da10f2e7d308b786f62ad12bed13e9e91dcdd03733db3cb29bbfa4e7a43cc447cf2338b9fc7dde9d15ce94"

RPROVIDES:${PN} += "libid3tag.so.0.16.2 \
libid3tag0-16-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
