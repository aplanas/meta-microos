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

RPM_NAME = "libpython3_11-1_0-3.11.4-1.2.aarch64.rpm"
RPM_HASH = "2fa28945a9fd6bbb2734dc1ef2b54e69e7b647941a5523d2d76d7ce3bb5e8a987843fcce39fe278076dcf0bf7d8bdf9eed1a30b03c6c7df833fea00b795064f6"

RPROVIDES:${PN} += "libpython3-11-1-0 \
libpython3.11.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python311-base"

inherit rpm
