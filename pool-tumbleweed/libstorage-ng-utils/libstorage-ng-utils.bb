SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.122"

RPM_NAME = "libstorage-ng-utils-4.5.122-1.1.aarch64.rpm"
RPM_HASH = "07d8749c7dcd81dcd0b448c7f4bbc329bb60cc87b048ab50f47585bb46247364ccd06d5fca999b2cd50a54f18480f6a69b80e8f794dc235427e6ab27f34e8090"

RPROVIDES:${PN} += "libstorage-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1"

inherit rpm
