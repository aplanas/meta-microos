SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.115"

RPM_NAME = "libstorage-ng-ruby-4.5.115-1.1.aarch64.rpm"
RPM_HASH = "0eca625b6aa8e764a796ef968929e199fa67e330541c6431480b04f3085a2e58b3bf1583967be8cb70bd14bf99c8b342faba1144cd42c56b9c25b21f84984fa2"

RPROVIDES:${PN} += "libstorage-ng-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
