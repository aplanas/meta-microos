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

RPM_NAME = "libpython3_8-1_0-3.8.17-1.2.aarch64.rpm"
RPM_HASH = "07a0f846833077176094118ec26b1ec3538425b0a84931ad96b21e3c9a653149e4ec76ab6b4022e50efdf2df2bedae2bc1fe93b9dd05d48f20276746c2db1f28"

RPROVIDES:${PN} += "libpython3-8-1-0 \
libpython3.8.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python38-base"

inherit rpm
