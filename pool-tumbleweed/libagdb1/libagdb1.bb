SUMMARY = "Library to access the Windows SuperFetch database format"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb1-20210429-3.7.aarch64.rpm"
RPM_HASH = "aba3fc6fc1fc981a48e0941dcf2f5a6a599427b4ebdba770d3ef2362419dcec8a2e7e34f5c26ced2c3b4a26f2e10723c7609a5fce85b7e3219cb049586e2b9b5"

RPROVIDES:${PN} += "libagdb.so.1 \
libagdb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
