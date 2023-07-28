SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.127"

RPM_NAME = "libstorage-ng-utils-4.5.127-1.1.aarch64.rpm"
RPM_HASH = "4945494b5200b381577fc313897db5188b33108fd7b6e6b55725aa9e4244cf904457a147913f3f5ce8a05d69687d588a7f04b1c8aceb93c3f12e1add08fec719"

RPROVIDES:${PN} += "libstorage-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1"

inherit rpm
