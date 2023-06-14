SUMMARY = "Library for creating and reading trace-cmd data files"
DESCRIPTION = "Library for creating and reading trace-cmd data files"
LICENSE = "LGPL-2.1-only"

PV = "1.3.1"

RPM_NAME = "libtracecmd1-1.3.1-2.3.aarch64.rpm"
RPM_HASH = "242e4d87374b833bc62f67a9f86fbb791041613c77ecf72202e7d414872ed684cfaa5e5ffb85856bb5c30ab9ff6a7e64c00194a8681f6a42e8be1e4f0439da9a"

RPROVIDES:${PN} += "libtracecmd.so.1 \
libtracecmd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
libzstd.so.1"

inherit rpm
