SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.115"

RPM_NAME = "libstorage-ng-utils-4.5.115-1.1.aarch64.rpm"
RPM_HASH = "0900b74abe58e855bbf694a2fe2c1978c9ebf6e93e99a11b6c8ac1c235a8bc95ddb822e466d626fbef9b88d33ecca1d640a58512de84e340beb1bedecc10586e"

RPROVIDES:${PN} += "libstorage-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1"

inherit rpm
