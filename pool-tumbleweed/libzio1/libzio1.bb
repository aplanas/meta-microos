SUMMARY = "A Library for Accessing Compressed Text Files"
DESCRIPTION = "Libzio provides a wrapper function for reading or writing gzip or bzip2 \
files with FILE streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.08"

RPM_NAME = "libzio1-1.08-2.7.aarch64.rpm"
RPM_HASH = "5c09406d28aff91ec0cd4f55897b19bc919878bf4589817abe49b1310d1bdebab966820d87e79277e495272fa460c2c2fd47caed7340dba31e695e7243895d53"

RPROVIDES:${PN} += "libzio \
libzio.so.1()(64bit) \
libzio1 \
libzio1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
