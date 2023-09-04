SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "libpython3_8-1_0-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "84887ba2a2e0f3ec710044aca4b5ab20c5fb8bbbbaba1a2b5c63d580fab33db8f6dce0c6b29396ee7e30c30073f8b42a826509bbfcb6524c684dcb919e554f6c"

RPROVIDES:${PN} += "libpython3-8-1-0 \
libpython3.8.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python38-base"

inherit rpm
