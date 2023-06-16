SUMMARY = "Python 3 Interpreter and Stdlib Core"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
package. \
 \
This package contains the interpreter core and most commonly used modules \
from the standard library. This is sufficient for many usecases, but it \
excludes components that depend on external libraries, most notably XML, \
database and UI toolkits support."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-base-3.12.0b1-1.2.aarch64.rpm"
RPM_HASH = "64405f400140d0821012fd6b648513656a45febc58ed87999982c2d9f457416e91099da350d4386a3c78bc78307b94f37d74725bb04c070717d0e0267bbe19ab"

RPROVIDES:${PN} += "python-abi \
python312-asyncio \
python312-base \
python312-typing \
python312-xml"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libexpat.so.1 \
libffi.so.8 \
liblzma.so.5 \
libm.so.6 \
libmpdec.so.3 \
libpython3-12-1-0 \
libpython3.12.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
