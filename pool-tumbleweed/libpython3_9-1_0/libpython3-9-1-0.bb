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

RPM_NAME = "libpython3_9-1_0-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "4268d1e939e7dfff3ba02ff0e086f47dfd3edab85c6fd2ea8f2751f2d404af8750b34d544de00ff7c9de5a7b712c85c646b37e2660ad0d859886b06630c1b256"

RPROVIDES:${PN} += "libpython3-9-1-0 \
libpython3.9.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python39-base"

inherit rpm
