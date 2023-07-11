SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython2.7 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "libpython2_7-1_0-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "63fd6729da9967d08f31d7766f3be078f6adff9bfa8ae57cc7fa646a1fcedbe1a1b2da6d8b0274e0a9f04dc7f278a96e18cd4a967657fe35610007c902872793"

RPROVIDES:${PN} += "libpython2-7-1-0 \
libpython2.7.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
