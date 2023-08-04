SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.133"

RPM_NAME = "libstorage-ng-devel-4.5.133-1.1.aarch64.rpm"
RPM_HASH = "51ec3628959c432c310742829decb9689c04564021ec52dd38579f05332fe2f0c0b7d6a4033636e8a0031039e75437542b00962849e0aaa1523f916af133cad1"

RPROVIDES:${PN} += "libstorage-ng-devel"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
libstorage-ng1 \
pkgconfig \
pkgconfig-libxml-2.0"

inherit rpm
