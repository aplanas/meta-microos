SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "libpython3_12-1_0-3.12.0b1-1.2.aarch64.rpm"
RPM_HASH = "00c33bae6e63c1803dd3286b7dff458758f617379fef779e492ccc6b650e0f3b7be49ccf505dff5847ed734f610a209fc32f1b1fdfc729ff7d63f89d5e833f2a"

RPROVIDES:${PN} += "libpython3.12.so.1.0()(64bit) \
libpython3_12-1_0 \
libpython3_12-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
python312-base"

inherit rpm
