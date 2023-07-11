SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.122"

RPM_NAME = "libstorage-ng-python3-4.5.122-1.1.aarch64.rpm"
RPM_HASH = "b1d8a780c4e1a5d959e3634aae7fe5cd9a841751808cfb4d951d83b27f1cf8d8a7f881d4b92d868cb74b7d01d4a3780c47061beb3ef1d9086a12d6fd58ba7603"

RPROVIDES:${PN} += "libstorage-ng-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1 \
python-abi"

inherit rpm
