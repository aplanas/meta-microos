SUMMARY = "Development files for libedit"
DESCRIPTION = "libedit is a command line editing and history library. It is designed \
to be used by interactive programs that allow the user to type commands \
at a terminal prompt. \
 \
This package holds the development files for libedit."
LICENSE = "BSD-3-Clause"

PV = "20210910.3.1"

RPM_NAME = "libedit-devel-20210910.3.1-2.2.aarch64.rpm"
RPM_HASH = "e0825c3b67fc62f6e9fab668239440249b2ec586be2b23c06ea0ce9b86a726c1106f32482d1e296fd230086fda9f95d8b443f364b17166934aacdca6885ab086"

RPROVIDES:${PN} += "libedit-devel \
libedit0-devel \
pkgconfig-libedit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libedit0"

inherit rpm
