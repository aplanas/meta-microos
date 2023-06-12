SUMMARY = "Development libraries for BLACS (openmpi4)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi4-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "91d1d7680665dc89a1ef912c149a13cba59aa19ad466a44883322628d39ed0bb4d84e39bf2ce6c650f9206a4bfbc2a298123870b48d66f5d595147769b063844"

RPROVIDES:${PN} += "blacs-openmpi4-devel \
libblacs.so.2.1.0()(64bit) \
libblacs2-openmpi4-devel \
libblacs2-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblacs2-openmpi4 \
libc.so.6(GLIBC_2.17)(64bit) \
libmpi.so.40()(64bit) \
openmpi4-devel"

inherit rpm
