SUMMARY = "Recast Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the recast library of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libRecast1-1.5.1+git20210305.c5cbd53-1.8.aarch64.rpm"
RPM_HASH = "fa0e35155e7d6cb171158aa256c56ee4556e7e1085a0248ba3d005f1921377e6641dc9368789d034bcfcc8cdb9e582b1bcb876d1327c5fefed71f97dac4ee381"

RPROVIDES:${PN} += "libRecast.so.1 \
libRecast1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
