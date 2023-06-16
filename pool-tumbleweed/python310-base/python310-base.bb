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

PV = "3.10.11"

RPM_NAME = "python310-base-3.10.11-1.2.aarch64.rpm"
RPM_HASH = "d724dac8e714c176e66384670b5d6c47c087088b8cd9c6e7d177b552fc246824d334e9ae3cf7e5c0a9f8954a381b18648fb43a3e13cec9f28f31257213e2d552"

RPROVIDES:${PN} += "python-abi \
python3-asyncio \
python3-base \
python3-typing \
python3-xml \
python310-asyncio \
python310-base \
python310-typing \
python310-xml \
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
libpython3-10-1-0 \
libpython3.10.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
