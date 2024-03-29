SUMMARY = "HFST spell checker runtime libraries"
DESCRIPTION = "HFST spell checker Runtime libraries for hfst-ospell"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "libhfstospell11-0.5.1-4.4.aarch64.rpm"
RPM_HASH = "37bacd3c5ee01474984813672f93853f5fe4376d4b8a1c24f023ee1288144bf6b0ed887e31c41293bceda33f9f1bfbf0de425c54c8add3bc5b883596dd974d76"

RPROVIDES:${PN} += "libhfstospell \
libhfstospell.so.11 \
libhfstospell11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
