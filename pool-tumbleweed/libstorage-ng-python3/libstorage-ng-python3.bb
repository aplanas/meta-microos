SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.123"

RPM_NAME = "libstorage-ng-python3-4.5.123-1.1.aarch64.rpm"
RPM_HASH = "b91eb23347bfccaa9a58659463e6ddb078733eacec2d5adc9c24bf50c43fe93828b0d4f9f605fbc027584cb83f82f2e519c1a5b21f34be553a3f13e608f4c217"

RPROVIDES:${PN} += "libstorage-ng-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1 \
python-abi"

inherit rpm
