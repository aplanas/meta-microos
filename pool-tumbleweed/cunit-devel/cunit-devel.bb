SUMMARY = "CUnit development files"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit development files."
LICENSE = "LGPL-2.0"

PV = "2.1.3"

RPM_NAME = "cunit-devel-2.1.3-5.26.aarch64.rpm"
RPM_HASH = "f8dab345af13b97a741a8706df42be0bd94be75ceb27e2f9ca5598486a0a246224693527c94bce29f3d833bc504c543edc9028df88dc839b0e636080e36e09e4"

RPROVIDES:${PN} += "cunit-devel \
cunit-devel(aarch-64) \
pkgconfig(cunit)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcunit.so.1()(64bit) \
libcunit1 \
ncurses-devel \
pkgconf-pkg-config"

inherit rpm
