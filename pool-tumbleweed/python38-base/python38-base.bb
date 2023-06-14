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

PV = "3.8.16"

RPM_NAME = "python38-base-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "42b8da7372b6876c36674f978b6c73848800b3609e47dd3d708b5c56966af6fb99a2a4dc2494f14cd0daae80f444fa563a79b399b21fa0716f061b3b9eb366a4"

RPROVIDES:${PN} += "python-abi \
python38-asyncio \
python38-base \
python38-typing \
python38-xml \
rpm-macro-have-python38"

RDEPENDS:${PN} += "/bin/sh \
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
libpython3-8-1-0 \
libpython3.8.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
