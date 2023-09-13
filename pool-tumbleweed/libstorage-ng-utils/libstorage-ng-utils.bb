SUMMARY = "Utils for libstorage-ng"
DESCRIPTION = "This package contains utils for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.141"

RPM_NAME = "libstorage-ng-utils-4.5.141-1.1.aarch64.rpm"
RPM_HASH = "16c2f1bad028f1564bb0a51aa461197cf392527825c3902adba1feb6004aae812c20275c0c9c3708c88e1dc5211f135bf1c1b79224c5a80271f4e14375741360"

RPROVIDES:${PN} += "libstorage-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1"

inherit rpm
