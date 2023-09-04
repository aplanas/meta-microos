SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "libpython3_12-1_0-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "91aec88531fd25d4ec80905aad7181a9902107c26b3d1c7b39bfa34a0784cd7fbf4c47f29001f7beaa2574e3571d0bbf986280915139534da98ef0e8eaa87b32"

RPROVIDES:${PN} += "libpython3-12-1-0 \
libpython3.12.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python312-base"

inherit rpm
