SUMMARY = "Library to support the Expert Witness Compression Format"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "libewf3-20230212-2.3.aarch64.rpm"
RPM_HASH = "67da694d0fe04a775794c659197d1ae03a5383fedc8bc64758df74687777fa8b8d3fd0d4d2182d1e85897da94b4584dcb1334c53cec4238626083f4121997d15"

RPROVIDES:${PN} += "libewf.so.3()(64bit) \
libewf.so.3(V_20230212)(64bit) \
libewf3 \
libewf3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcthreads.so.1()(64bit) \
libcthreads.so.1(V_20220102)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdata.so.1()(64bit) \
libfdata.so.1(V_20230319)(64bit) \
libfvalue.so.1()(64bit) \
libfvalue.so.1(V_20220120)(64bit) \
libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit) \
libz.so.1()(64bit) \
timezone"

inherit rpm
