SUMMARY = "Library to access Microsoft PFF and OFF format files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff1-20230325-1.4.aarch64.rpm"
RPM_HASH = "276f92e17dddb8643a433596b59adf4cd1af2e5b1d990e4c66d5408245edf4912a6ee222e168dba0e3530349da7abec56232e8cdc5cf9195def491dd5fb48006"

RPROVIDES:${PN} += "libpff.so.1()(64bit) \
libpff.so.1(V_20230325)(64bit) \
libpff1 \
libpff1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdata.so.1()(64bit) \
libfdata.so.1(V_20230319)(64bit) \
libfmapi.so.1()(64bit) \
libfmapi.so.1(V_20230408)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit) \
libz.so.1()(64bit)"

inherit rpm
