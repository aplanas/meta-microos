SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.136"

RPM_NAME = "libstorage-ng-utils-4.5.136-1.1.aarch64.rpm"
RPM_HASH = "c2b839b4f5941a12375aa12e645649ca2ecdf05650e525e8dc70f55cb74a30ea1061005b16d52e18522a1b69279ca845e757b444dcaebad27a1e0f62cfdb73cb"

RPROVIDES:${PN} += "libstorage-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1"

inherit rpm
