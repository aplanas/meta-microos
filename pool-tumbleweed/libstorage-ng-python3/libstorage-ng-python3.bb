SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.141"

RPM_NAME = "libstorage-ng-python3-4.5.141-1.1.aarch64.rpm"
RPM_HASH = "73f8952b1f3c6224712127f0b3d98379c9ef508b9105c073ac30db927b6db2ea75e4edc4b9d6b20a658942819938344b9454dc45d52b4714ec7239887026120d"

RPROVIDES:${PN} += "libstorage-ng-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1 \
python-abi"

inherit rpm
