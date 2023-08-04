SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.133"

RPM_NAME = "libstorage-ng-ruby-4.5.133-1.1.aarch64.rpm"
RPM_HASH = "40eb00789b515dc7f4e9e8cf2e5a3aba287e17394d3c30e708f05bffe7761b6dfdcc16757242be5457753a559ee252748dc0f6ccce33d170725d5cf00c1abf6d"

RPROVIDES:${PN} += "libstorage-ng-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
