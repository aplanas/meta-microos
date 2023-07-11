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

PV = "3.8.17"

RPM_NAME = "python38-base-3.8.17-1.2.aarch64.rpm"
RPM_HASH = "e7770bec0d7c63be1cb8d20279aa880f7b7a105f713f807916b58f127419bf701b54868825e158fe2475cfbc6183f712e2fe9bcb0949523dc531bd5a29df4ad8"

RPROVIDES:${PN} += "python-abi \
python38-asyncio \
python38-base \
python38-typing \
python38-xml \
rpm-macro-have-python38"

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
libpython3-8-1-0 \
libpython3.8.so.1.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
