SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "libpython3_8-1_0-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "860e3dceece2da789977daa4a917f0f67e113e9449aa2ada6d64505445df59984abfe27e399d757543dfbb08445602105bd200c6c0db48a633d94fefa256a61f"

RPROVIDES:${PN} += "libpython3.8.so.1.0()(64bit) \
libpython3_8-1_0 \
libpython3_8-1_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
python38-base"

inherit rpm
