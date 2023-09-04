SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf1-20230319-2.1.aarch64.rpm"
RPM_HASH = "6b24235ee5adc647d5e96d648c53a509bf54a9747ed8fd0bffc702dab49eb20449fb0bb907ea9e3ec4ee0a477443bd9609ec820f74d1bb877b1994fc167f194d"

RPROVIDES:${PN} += "libregf.so.1 \
libregf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
