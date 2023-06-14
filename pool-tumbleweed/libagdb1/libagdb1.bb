SUMMARY = "Library to access the Windows SuperFetch database format"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb1-20210429-3.5.aarch64.rpm"
RPM_HASH = "e62870a95bb618204b5630dc96c11df01825cb12cfd04a71a409ab701064ce4a12d4c6699c7d34bfe9d9472f619eda9ce5ee8eb7ec4eed1065375b89331a84df"

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
