SUMMARY = "Development files for zlib-ng"
DESCRIPTION = "The zlib-ng-devel package contains header files for \
developing application that use zlib-ng."
LICENSE = "Zlib"

PV = "2.1.3"

RPM_NAME = "zlib-ng-devel-2.1.3-1.1.aarch64.rpm"
RPM_HASH = "ffea808f572cdf76a9304ad13a344115236f63b4fcebaf1064e00ac7e8b8042d68a3b5e4bc30c4df5cb84d83b97f39bc8f6f8e1107705e83f0be1efea6f83940"

RPROVIDES:${PN} += "pkgconfig-zlib-ng \
zlib-ng-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng2"

inherit rpm
