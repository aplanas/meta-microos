SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "libpython3_10-1_0-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "98d496918360f5f0f7e0cdbea8e734eb2c017eb6d90dd282214b9e66665f5e28c56e84b3ce464ed12a72b64e36bb961aba5b19fb2d11db14fbf43d90d1675b84"

RPROVIDES:${PN} += "libpython3-10-1-0 \
libpython3.10.so.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python310-base"

inherit rpm
