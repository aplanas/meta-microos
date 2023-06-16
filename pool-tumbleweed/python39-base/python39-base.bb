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

PV = "3.9.16"

RPM_NAME = "python39-base-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "2071f0f57fa710454b9fe6b61696db7a1c79742324a7223c066cc9d7ded8d309ba01a473907306b57f7ae1fce4aaa2e0d4f0b4e246628f5ae2ff7b7dbedbd9d5"

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
