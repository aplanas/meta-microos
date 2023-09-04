SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.136"

RPM_NAME = "libstorage-ng-python3-4.5.136-1.1.aarch64.rpm"
RPM_HASH = "1ac679a2bb8adc54fb157a34c85618cc5b558c35b51d9fb6eb13c3056aadee1c164d4cc9927b6f9a6281b1934002b0569d523099c238a212eddb28c607e5e629"

RPROVIDES:${PN} += "libstorage-ng-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1 \
python-abi"

inherit rpm
