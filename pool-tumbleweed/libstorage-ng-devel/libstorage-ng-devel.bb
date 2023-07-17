SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.123"

RPM_NAME = "libstorage-ng-devel-4.5.123-1.1.aarch64.rpm"
RPM_HASH = "2bab1ff804e6e8f1c621518f9eedc48d0d57c05531af9de6eec4b2cf641fc98772920268e4da164b204c1b66062b6b68e44bb6cbf4956f607d22ec094def3b10"

RPROVIDES:${PN} += "libstorage-ng-devel"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
libstorage-ng1 \
pkgconfig \
pkgconfig-libxml-2.0"

inherit rpm
