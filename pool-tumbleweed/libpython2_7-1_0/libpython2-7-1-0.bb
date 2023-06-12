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

RPM_NAME = "libpython2_7-1_0-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "5123a09737c93790dba3363f21f7225d09061f3c565f7c45fc913aa579f8c3ffd7ab4e4b8db22af87d21a273c3317dbc03bf7418be41672913ad4eb9e7b36afd"

RPROVIDES:${PN} += "libpython2.7.so.1.0()(64bit) \
libpython2_7-1_0 \
libpython2_7-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
