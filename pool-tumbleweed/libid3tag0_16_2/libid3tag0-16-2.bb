SUMMARY = "ID3 Tag Manipulation Library"
DESCRIPTION = "libid3tag is a library for reading and writing ID3 tags, both ID3v1 and \
the various versions of ID3v2."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "libid3tag0_16_2-0.16.2-1.5.aarch64.rpm"
RPM_HASH = "ed591c29e7fd4e0398aa85258f106f9deca2df522f799532a48c31582502e33393f76c9012bc5450c1cd8a3267a82f103c10b907cfc5c88efd3fe36677342605"

RPROVIDES:${PN} += "libid3tag.so.0.16.2 \
libid3tag0-16-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
