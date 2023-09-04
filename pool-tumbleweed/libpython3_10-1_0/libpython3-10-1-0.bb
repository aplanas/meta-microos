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

RPM_NAME = "libpython3_10-1_0-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "2d195008f6831bcd05c8acd2e306486da353108847d14f9f07329994d19bfbf76577a87713ef6ffa561bdd0292b9ae76a0550d146d531f9367a366e4511a31e7"

RPROVIDES:${PN} += "libpython3-10-1-0 \
libpython3.10.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python310-base"

inherit rpm
