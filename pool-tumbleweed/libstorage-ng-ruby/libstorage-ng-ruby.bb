SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.123"

RPM_NAME = "libstorage-ng-ruby-4.5.123-1.1.aarch64.rpm"
RPM_HASH = "7e755020cf1b76914e8ac2b9e89e1df19c480f3a0ffb85938452a35100bbad2f688394daffc432410752a3e1721c2ad6abdccd0f76b0fdba27b42313f09c3d48"

RPROVIDES:${PN} += "libstorage-ng-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
