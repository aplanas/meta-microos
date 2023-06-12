SUMMARY = "Library for working with ISO 9660 filesystems"
DESCRIPTION = "A library for working with ISO 9660 filesystems, which are mainly used on CDs."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libiso9660-11-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "e2f0cf9322a54e300914d27c958a5b403085e0a000eaa4fd00bfe835bcef79d0c66b4f0d38169035ea4fb7deae2b8dc469621a92d248e1e5392029bbdecd8e53"

RPROVIDES:${PN} += "libiso9660-11 \
libiso9660-11(aarch-64) \
libiso9660.so.11()(64bit) \
libiso9660.so.11(ISO9660_11)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit)"

inherit rpm
