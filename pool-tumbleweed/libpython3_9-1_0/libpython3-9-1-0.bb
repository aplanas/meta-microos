SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "libpython3_9-1_0-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "800021b68e4f7ab94eb8b9cb47c689efa3217b2bf06e2f0a70931953e114205781f5424f2d7f6d84d0bde0af955387852e66cbf22acfe25b514a9fc45aea1069"

RPROVIDES:${PN} += "libpython3-9-1-0 \
libpython3.9.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python39-base"

inherit rpm
