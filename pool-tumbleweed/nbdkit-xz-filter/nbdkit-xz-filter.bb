SUMMARY = "XZ filter for nbdkit"
DESCRIPTION = "This package is the xz filter for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-xz-filter-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "28821f55f4576be3d1e53c2ccc5a3873718b0779a5a1269b8125013140f701c47cbbfe6f6241b5949f666132917691bf9ddd21e051ebdca150d602019bdc7373"

RPROVIDES:${PN} += "nbdkit-xz-filter \
nbdkit-xz-filter(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
nbdkit-server"

inherit rpm
