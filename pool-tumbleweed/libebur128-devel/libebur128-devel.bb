SUMMARY = "Development files for libebur128"
DESCRIPTION = "A library implementing the EBU R128 loudness standard. \
 \
This package contains header files and libraries needed to develop \
application that use libebur128."
LICENSE = "MIT"

PV = "1.2.6"

RPM_NAME = "libebur128-devel-1.2.6-1.8.aarch64.rpm"
RPM_HASH = "9750af526df72716bf4f252818c5dd6c1d82cd94574b83b055f7510ccff21ff6a5e1d7bad39f22c5f6380d6e2b487b524caab126377e6f58f804e7e76f412609"

RPROVIDES:${PN} += "libebur128-devel \
pkgconfig-libebur128"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libebur128-1"

inherit rpm
