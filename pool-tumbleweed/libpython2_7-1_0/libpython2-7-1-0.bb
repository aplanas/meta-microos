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

RPM_NAME = "libpython2_7-1_0-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "2278015b4be047e279880b8239769175e1497098cd5bec959613af7f693c4e0306352c822e3c0b41756c2ebd3cae87f9569486376254814eb107c91b62d4c4e7"

RPROVIDES:${PN} += "libpython2-7-1-0 \
libpython2.7.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
