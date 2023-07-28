SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.127"

RPM_NAME = "libstorage-ng-ruby-4.5.127-1.1.aarch64.rpm"
RPM_HASH = "58f0f230b1cb0d17e435c5c966d07a2c0f2631d6f554ec478b92e835b3fa64bf23ad8110a09486e19fb5f95d2e97f826ec1c5db4edeb8d5a0a5df6c4f64221a4"

RPROVIDES:${PN} += "libstorage-ng-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
