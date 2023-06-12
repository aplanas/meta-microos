SUMMARY = "Library for interacting with Btrfs"
DESCRIPTION = "This package contains the libbtrfs.so shared library needed for some \
applications to interface with btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "libbtrfs0-6.3-1.1.aarch64.rpm"
RPM_HASH = "63164710b8547dc5f2c01878e9e893ac3cc4b1b8542293adb14cd4851630fdffe2692d06ce7636b0931dbfd5be7aaeb6633379e9eaf50cd593c808ac3c2d4f71"

RPROVIDES:${PN} += "libbtrfs.so.0()(64bit) \
libbtrfs.so.0(LIBBTRFS_0.1)(64bit) \
libbtrfs0 \
libbtrfs0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
