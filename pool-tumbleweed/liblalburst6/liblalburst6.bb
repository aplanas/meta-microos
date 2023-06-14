SUMMARY = "Shared library for LAL Burst"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL Burst library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "liblalburst6-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "aeebac4741b182940d57a199f43159db01a3f89641ea3a32bf3275e0aabc7cff40510198568c066764174d5c44dda1d21ce0bc0174e142a261ee5961a9b408f6"

RPROVIDES:${PN} += "liblalburst.so.6 \
liblalburst6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.25 \
liblal.so.20 \
liblalmetaio.so.10 \
liblalsimulation.so.31 \
libm.so.6 \
libmetaio.so.1"

inherit rpm
