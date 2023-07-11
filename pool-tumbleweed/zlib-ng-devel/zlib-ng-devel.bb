SUMMARY = "Development files for zlib-ng"
DESCRIPTION = "The zlib-ng-devel package contains header files for \
developing application that use zlib-ng."
LICENSE = "Zlib"

PV = "2.1.2"

RPM_NAME = "zlib-ng-devel-2.1.2-2.1.aarch64.rpm"
RPM_HASH = "d9f4d76c5683c4654602f5ad4606c0fa904424bcbc772ea479aea0be26125724d3d1a634611b1ad227a0095f556c42691d64be1ec9d74da43ff452e5478ed71b"

RPROVIDES:${PN} += "pkgconfig-zlib-ng \
zlib-ng-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng2"

inherit rpm
