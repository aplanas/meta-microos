SUMMARY = "Ruby bindings for libstorage-ng"
DESCRIPTION = "This package contains Ruby bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.122"

RPM_NAME = "libstorage-ng-ruby-4.5.122-1.1.aarch64.rpm"
RPM_HASH = "223852dedccdb1a241084a212d84a0593e4aca5ad283093a60300b8b0d7ccee223f46cee234176b54765be5919ce714a29d4a1c7422d36b054353ed765fab96f"

RPROVIDES:${PN} += "libstorage-ng-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1"

inherit rpm
