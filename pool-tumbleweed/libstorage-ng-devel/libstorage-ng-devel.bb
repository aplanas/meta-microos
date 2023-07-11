SUMMARY = "Header files and documentation for libstorage-ng"
DESCRIPTION = "This package contains header files and documentation for developing with \
libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.122"

RPM_NAME = "libstorage-ng-devel-4.5.122-1.1.aarch64.rpm"
RPM_HASH = "225177d4af3ce3f854c6bfb74ee187ddc9da380bc43262c02291b3b260becc898cd795bf3efc93522a1d8579f2c65ecce7da7227321ece02802622c23d6a6e42"

RPROVIDES:${PN} += "libstorage-ng-devel"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
libstorage-ng1 \
pkgconfig \
pkgconfig-libxml-2.0"

inherit rpm
