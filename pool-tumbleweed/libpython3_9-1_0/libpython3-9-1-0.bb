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

RPM_NAME = "libpython3_9-1_0-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "05677e8776f04383c907afc3a6e4073eb881f8ec4b5f180e677693e82548529f3ebb3954d896f9ea7343b15f8c530dd0eb2f1d02d59114937c522ad65062cb78"

RPROVIDES:${PN} += "libpython3-9-1-0 \
libpython3.9.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python39-base"

inherit rpm
