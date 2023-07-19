SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "libpython3_12-1_0-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "cebc0934d19368ffbe1b5fb30ce86e25f2b3c2353cac42ec05381f71d1ca00d9f077e7f6d5822ba171394cd4a25b3a2fc1461ef8e96e51315b30f7bfe88a2df8"

RPROVIDES:${PN} += "libpython3-12-1-0 \
libpython3.12.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python312-base"

inherit rpm
