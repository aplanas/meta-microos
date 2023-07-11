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

RPM_NAME = "libpython3_10-1_0-3.10.12-1.2.aarch64.rpm"
RPM_HASH = "35eb6bb558e4ef5dd01c25cd41dc57aad9895eef3604f04c339579c8216fc3e43158c3a47be17a4fdc7af577ee8f402a4dabe9830f5953a135c24767509918cc"

RPROVIDES:${PN} += "libpython3-10-1-0 \
libpython3.10.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python310-base"

inherit rpm
