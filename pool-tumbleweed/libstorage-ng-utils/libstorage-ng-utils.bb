SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.133"

RPM_NAME = "libstorage-ng-utils-4.5.133-1.1.aarch64.rpm"
RPM_HASH = "42ce5d09e3b0b471497ba1d316502d1f8148aa0c99794296f81738e7e2d5cfcd07cc426fd546116dca545e29206b724f42331df209396631619fc88c9b038a2b"

RPROVIDES:${PN} += "libstorage-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1"

inherit rpm
