SUMMARY = "A Library for Accessing Compressed Text Files"
DESCRIPTION = "Libzio provides a wrapper function for reading or writing gzip or bzip2 \
files with FILE streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.08"

RPM_NAME = "libzio1-1.08-2.8.aarch64.rpm"
RPM_HASH = "84326b03afc973eee075b3f5a3d4c8402ff3bf2004442092d2bb9df1c901cd4ddc465424bd2738c6722b7402169fb95aef21b14f9b4264ef86750bbc7e79339c"

RPROVIDES:${PN} += "libzio \
libzio.so.1 \
libzio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
