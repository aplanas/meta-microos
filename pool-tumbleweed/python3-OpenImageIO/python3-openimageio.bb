SUMMARY = "Python Bindings for OpenImageIO"
DESCRIPTION = "This package contains python bindings for OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.13.0"

RPM_NAME = "python3-OpenImageIO-2.4.13.0-1.1.aarch64.rpm"
RPM_HASH = "103538f570b751377964c7c2c67b1914d020fa86a8a1aaed0a3285205ad348ed9c07e199dba5d0f4f8231357cb781534195dbd26d1d52af4a526eae036aba9a8"

RPROVIDES:${PN} += "python3-OpenImageIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libOpenImageIO-Util.so.2.4 \
libOpenImageIO.so.2.4 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
