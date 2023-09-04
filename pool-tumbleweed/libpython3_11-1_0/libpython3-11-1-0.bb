SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "libpython3_11-1_0-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "717c499a171c08463373996b69970c9f9f9d48fa8ac412087be37a375913e56076db38c7cde5bfba1eccc0661c1eb54dc042dfc5933081185dc26b6bc711e210"

RPROVIDES:${PN} += "libpython3-11-1-0 \
libpython3.11.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python311-base"

inherit rpm
