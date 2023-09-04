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

PV = "3.12.0rc1"

RPM_NAME = "python312-base-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "64eb03f746d02eb0e093bcd6ad05a8be2d11da958c194a00fd728ef5bf7331f782998b1827084209fcc471629b4a8093c7e7f1a28c7464057c7b4bbb115aaeec"

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
