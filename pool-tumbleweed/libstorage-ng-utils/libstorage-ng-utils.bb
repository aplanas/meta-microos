SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.123"

RPM_NAME = "libstorage-ng-utils-4.5.123-1.1.aarch64.rpm"
RPM_HASH = "6944b8f95c2580d15f18adf3204292deb4637c181e93b83313159d80f00bf59da4e1515cf684baa5ec673a3bb6fb84732588951c1a13a8589f7c7f6470587aeb"

RPROVIDES:${PN} += "libstorage-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1"

inherit rpm
