SUMMARY = "Kernel dump file access library"
DESCRIPTION = "A library that provides an abstraction layer for reading kernel dump \
core files.  It supports different kernel dump core formats, virtual \
to physical translation, Xen mappings and more. \
 \
This package contains the libkdumpfile library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libkdumpfile10-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "4084f56e9afb348376a7170d2aa8aa7991f42d6da6bf2dd7cf058234862f54943b0c3f4096556750a7a059593df27a8b1118b267e42e555edf42834d43e1e479"

RPROVIDES:${PN} += "libkdumpfile.so.10 \
libkdumpfile10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
liblzo2.so.2 \
libsnappy.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
