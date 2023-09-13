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

PV = "3.11.5"

RPM_NAME = "python311-base-3.11.5-1.2.aarch64.rpm"
RPM_HASH = "55d9604c2fcde118b867af5a744f391525d070d90cf604cd67c01c7b87b4686388f6d2556b02072652aa766f38db56b736de3cd80792c029a701d4db98b000ec"

RPROVIDES:${PN} += "python-abi \
python3-asyncio \
python3-base \
python3-typing \
python3-xml \
python311-asyncio \
python311-base \
python311-typing \
python311-xml \
rpm-macro-cpython3-soabi \
rpm-macro-have-python3 \
rpm-macro-py3-compile \
rpm-macro-py3-soflags"

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
libpython3-11-1-0 \
libpython3.11.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
