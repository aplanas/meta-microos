SUMMARY = "Library to access Microsoft PFF and OFF format files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff1-20230325-2.1.aarch64.rpm"
RPM_HASH = "b7fc66d1861e5637c3a7eba4957b986b8b1e269ea20389eb2834416c8ff0ce8d82d9356261bacbbc0c0cd4e38573ad0e3830ea741eed7e2dadb72a78861b3d5d"

RPROVIDES:${PN} += "libpff.so.1 \
libpff1"

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
libfmapi.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
