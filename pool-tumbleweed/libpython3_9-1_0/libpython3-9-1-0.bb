SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "libpython3_9-1_0-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "fe95876f1abd42428289dd5a76d4e6087aea252779700851a43467742d6a5e90cde4c7eed775aa4cfd2f1d62620a29a4ae9e7ee83a030e8de7eab99e67d09358"

RPROVIDES:${PN} += "libpython3-9-1-0 \
libpython3.9.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python39-base"

inherit rpm
