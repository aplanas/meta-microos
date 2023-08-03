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

RPM_NAME = "python39-base-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "462f71cbd320007121f794480c2ae7e8c3b8d2d5f3d406fd6c0c142a5986683bf178fc9c67e9ff0d11770d29485ef3552511a1cd91ee643fe52d08085fd86319"

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
