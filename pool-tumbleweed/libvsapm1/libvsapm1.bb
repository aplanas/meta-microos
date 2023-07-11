SUMMARY = "Library for accessing the GUID partition table format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "libvsapm1-20210626-4.9.aarch64.rpm"
RPM_HASH = "256444045c1d727e9f1b5c82cd9a1ebdecdf86a80f84bad469d6560195223fb5a5eb6a093cce89412b0b5134ce8cedd012d53c58489069a7bfaf29d64dd5e434"

RPROVIDES:${PN} += "libvsapm.so.1 \
libvsapm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1"

inherit rpm
