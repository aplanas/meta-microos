SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.115"

RPM_NAME = "libstorage-ng-devel-4.5.115-1.1.aarch64.rpm"
RPM_HASH = "fa6b7fdeee181af8a2fa293e3e71e8371098ca5e08c090dc05d1f073e42305542d569bfc7d071fe2f52a8b19585c4980975ea81c72b6851529765279b2ee7154"

RPROVIDES:${PN} += "libstorage-ng-devel \
libstorage-ng-devel(aarch-64)"
RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
libstorage-ng1 \
pkgconfig \
pkgconfig(libxml-2.0)"

inherit rpm
