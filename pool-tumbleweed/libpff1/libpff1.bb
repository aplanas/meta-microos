SUMMARY = "Library to access Microsoft PFF and OFF format files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff1-20230325-1.8.aarch64.rpm"
RPM_HASH = "a7bc882f1e799c5bd4ae0d5bea27c78fff9fff7dffef8c6fa60b510acb81250a8d8c0eddd0df9de731f8dc3e21c44ac0355e23587024dde1e1d9c982245e6c70"

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
