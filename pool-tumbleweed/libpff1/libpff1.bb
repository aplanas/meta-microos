SUMMARY = "Library to access Microsoft PFF and OFF format files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff1-20230325-1.4.aarch64.rpm"
RPM_HASH = "276f92e17dddb8643a433596b59adf4cd1af2e5b1d990e4c66d5408245edf4912a6ee222e168dba0e3530349da7abec56232e8cdc5cf9195def491dd5fb48006"

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
