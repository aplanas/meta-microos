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

PV = "3.9.17"

RPM_NAME = "python39-base-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "745e1c5841af6f2e0dc4fc323c9a9c170ce0eb5c9bea1179d2d2eaaff2211acb70348759d22cdc63bf8a5fe676a3560ceb6d45f7055018fb7371ca6e23822925"

RPROVIDES:${PN} += "python-abi \
python39-asyncio \
python39-base \
python39-typing \
python39-xml"

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
libpython3-9-1-0 \
libpython3.9.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
