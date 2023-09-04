SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.136"

RPM_NAME = "libstorage-ng-devel-4.5.136-1.1.aarch64.rpm"
RPM_HASH = "b725282f1299365e1c5db81afddaa71e52d2a694b0c31453fad85ff56671c2d5a29d4a564c56ac5e92a89a7e2819d5584dbbc71d7854efb4e074c6f1b1f823ef"

RPROVIDES:${PN} += "libstorage-ng-devel"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
libstorage-ng1 \
pkgconfig \
pkgconfig-libxml-2.0"

inherit rpm
