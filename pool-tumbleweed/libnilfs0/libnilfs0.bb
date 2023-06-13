SUMMARY = "Library for interacting with nilfs"
DESCRIPTION = "This package contains shared library needed for some applications to \
interface with nilfs"
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "libnilfs0-2.2.9-1.4.aarch64.rpm"
RPM_HASH = "366a056e0084d89a5ba579953a529db083d520a99eb4ad4bc4a8b86a1eef2a27d2f80aac51f227f847d703e5dcca72d312758240964be1f402dd47db033db644"

RPROVIDES:${PN} += "libnilfs.so.0()(64bit) \
libnilfs0 \
libnilfs0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
