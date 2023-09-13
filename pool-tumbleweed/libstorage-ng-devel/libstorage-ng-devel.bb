SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.141"

RPM_NAME = "libstorage-ng-devel-4.5.141-1.1.aarch64.rpm"
RPM_HASH = "78d77e48e7d527776915fb1c830116c553bcff37d40ec23d162615b199d659fd73bd268f94ce59afe1bc272d9ec642eba4589bdb1cd59b48bc8e1f4bddc78ba8"

RPROVIDES:${PN} += "libstorage-ng-devel"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
libstorage-ng1 \
pkgconfig \
pkgconfig-libxml-2.0"

inherit rpm
