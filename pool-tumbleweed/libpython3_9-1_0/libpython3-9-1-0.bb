SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "libpython3_9-1_0-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "8a5eda1540c76a090704fa3afa58041e0a4e7604d36a96c82cfe3d3814a2009686f9409f599f3b1a9675866af661f81eccdc08c7f7942487d626f76cb0f95287"

RPROVIDES:${PN} += "libpython3-9-1-0 \
libpython3.9.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python39-base"

inherit rpm
