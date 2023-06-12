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

RPROVIDES:${PN} += "python(abi) \
python38-asyncio \
python38-base \
python38-base(aarch-64) \
python38-typing \
python38-xml \
rpm_macro(have_python38)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libexpat.so.1()(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmpdec.so.3()(64bit) \
libpython3.8.so.1.0()(64bit) \
libpython3_8-1_0 \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_2.20)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
