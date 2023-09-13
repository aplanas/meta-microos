SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "libpython3_8-1_0-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "b734bbceaba44f0f20e4acc5617492c84e664f8e1ca39ebe9dd805a490f1f24b4888fa569f0dd438bbe3e7eaa845e45c1709e0aa4cc6a95e889f9facf4157761"

RPROVIDES:${PN} += "libpython3-8-1-0 \
libpython3.8.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python38-base"

inherit rpm
