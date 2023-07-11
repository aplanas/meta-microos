SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "libpython3_12-1_0-3.12.0b3-1.2.aarch64.rpm"
RPM_HASH = "f8d2817e8670a4ce3a6af85a8e9c846895083cb683711790661cbe0bf5ccb1bed7786e6f91f0c91ae6cc58d4536e73bc65e691f4218a4e66af1a97dc0a073a56"

RPROVIDES:${PN} += "libpython3-12-1-0 \
libpython3.12.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python312-base"

inherit rpm
