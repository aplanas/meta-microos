SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "libpython3_11-1_0-3.11.5-1.2.aarch64.rpm"
RPM_HASH = "adcdde9033f2c9dc8e1c7c926bf5c7c4538066416b1cd3c2ac1ddfa728f9a70f11694650128c69194e38d6de42263d14e8c2596f5eabbe3133b50f30a81a0db3"

RPROVIDES:${PN} += "libpython3-11-1-0 \
libpython3.11.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python311-base"

inherit rpm
