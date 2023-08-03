SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "libpython3_10-1_0-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "2f02435b00bb939ed053c28695387ffb64ea06a0ff381607be406ef7ae3991758979ff5269e140d4b4e6c4d1155eebaa9ab6f3f0e2f9e68198af3a21c4a56cd0"

RPROVIDES:${PN} += "libpython3-10-1-0 \
libpython3.10.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python310-base"

inherit rpm
