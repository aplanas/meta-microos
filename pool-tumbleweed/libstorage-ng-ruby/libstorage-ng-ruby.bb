SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.141"

RPM_NAME = "libstorage-ng-ruby-4.5.141-1.1.aarch64.rpm"
RPM_HASH = "a1ed11701e394633932da75485d225362bc4a014fce358eb424c1f5fd85fe8573c43932157903a8534c0ce9fd8b96ecf75fe11ca99a2be81d353b4ad0e2bf585"

RPROVIDES:${PN} += "libstorage-ng-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
