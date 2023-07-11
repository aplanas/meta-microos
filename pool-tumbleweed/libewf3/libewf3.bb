SUMMARY = "Library to support the Expert Witness Compression Format"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager."
LICENSE = "LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "libewf3-20230212-2.7.aarch64.rpm"
RPM_HASH = "b4672c45eeb271b3203cfd5bde089a3ece6fd07072aa226e2e607a5d6f5cf8e9a59ac882fdedaaa4c81a13c26abce4d3bfde41ff86802335dc041a154e4fcde9"

RPROVIDES:${PN} += "libewf.so.3 \
libewf3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libbz2.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libhmac.so.1 \
libuna.so.1 \
libz.so.1 \
timezone"

inherit rpm
