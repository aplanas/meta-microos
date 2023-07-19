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

PV = "3.12.0b4"

RPM_NAME = "python312-base-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "591cb6e650c41038a3d9347b2b84287b690face1945e8a9bfefd846dbf2a73a3d7d04ca8289a1c3f578b09271a23672f945e7d6ed424566e30d98af22184215b"

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
