SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - python support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.7.5"

RPM_NAME = "libgensio_python_swig6-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "9be03225f83e72e349559dd1b875cf4a6070be475e53a8472d02a5d8d09980d720090ce6ddf0ab2675da76b5075101c81d2285423ccb360253a146bc6e050338"

RPROVIDES:${PN} += "libgensio-python-swig.so.6 \
libgensio-python-swig6 \
libgensio0-/usr/lib/libgensio-python-swig.so.0.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgensioosh.so.6 \
libpython3.11.so.1.0"

inherit rpm
