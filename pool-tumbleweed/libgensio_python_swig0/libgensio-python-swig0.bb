SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - python support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libgensio_python_swig0-2.6.1-1.6.aarch64.rpm"
RPM_HASH = "a299dea550f5ede48df277cd4c10a3be8e6b1a450ae7f2de1a0978c0a0b2014a882ade9bcb2b7190be5e31af834cdedc5bd31692b47f4f2f32615b32ba186d07"

RPROVIDES:${PN} += "libgensio-python-swig.so.0 \
libgensio-python-swig0 \
libgensio0-/usr/lib/libgensio-python-swig.so.0.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgensioosh.so.0 \
libpython3.11.so.1.0"

inherit rpm
