SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.136"

RPM_NAME = "libstorage-ng-ruby-4.5.136-1.1.aarch64.rpm"
RPM_HASH = "cb8a3cc164558295c095acf91a136727e96340b8e3532cf5a9bb3676d3c774f1ee3c78a251026dc8012a1358562275b1d4a1f4d6dfa77d716c786163f667b3ee"

RPROVIDES:${PN} += "libstorage-ng-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
