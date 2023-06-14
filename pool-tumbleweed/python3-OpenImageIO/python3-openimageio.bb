SUMMARY = "Python Bindings for OpenImageIO"
DESCRIPTION = "This package contains python bindings for OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "python3-OpenImageIO-2.4.12.0-1.1.aarch64.rpm"
RPM_HASH = "2954a1c3fdf1c81fa57e11d2385441b5b879530f6ecf963928efcca511ba40b3ced7bed64e6e6ad5d2807a8751577e87ee4c8ccaf0cbabe1cfc8ee2c5ce80083"

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
