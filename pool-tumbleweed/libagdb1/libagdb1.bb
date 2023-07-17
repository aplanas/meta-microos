SUMMARY = "Library to access the Windows SuperFetch database format"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb1-20210429-3.8.aarch64.rpm"
RPM_HASH = "f1a5072cd882c6e963c4242e6b5a2786aeba4ccfcfd924295643d5a2308a0f4f18e5212ee7d78304da2306adc188f592846b13ef3200a7474fad613ab0a27d16"

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
