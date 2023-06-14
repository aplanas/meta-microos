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

PV = "3.11.3"

RPM_NAME = "python311-base-3.11.3-1.2.aarch64.rpm"
RPM_HASH = "b0cd4bcc468c61ca33442a4759a7130b4f5d64f5f502f80fe8a1e2fe05daf758d4175cb5323b68ca6898de17fc7626c504efe82123f4d801dd516eab4e884c6a"

RPROVIDES:${PN} += "python-abi \
python311-asyncio \
python311-base \
python311-typing \
python311-xml"

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
libpython3-11-1-0 \
libpython3.11.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
