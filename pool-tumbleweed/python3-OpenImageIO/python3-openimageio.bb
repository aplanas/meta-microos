SUMMARY = "Python Bindings for OpenImageIO"
DESCRIPTION = "This package contains python bindings for OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "python3-OpenImageIO-2.4.12.0-1.1.aarch64.rpm"
RPM_HASH = "2954a1c3fdf1c81fa57e11d2385441b5b879530f6ecf963928efcca511ba40b3ced7bed64e6e6ad5d2807a8751577e87ee4c8ccaf0cbabe1cfc8ee2c5ce80083"

RPROVIDES:${PN} += "python3-OpenImageIO \
python3-OpenImageIO(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libImath-3_1.so.29()(64bit) \
libOpenImageIO.so.2.4()(64bit) \
libOpenImageIO_Util.so.2.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
