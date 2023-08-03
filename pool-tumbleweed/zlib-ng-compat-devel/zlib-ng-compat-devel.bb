SUMMARY = "Development files for zlib-ng-compat"
DESCRIPTION = "The zlib-ng-compat-devel package contains header files for \
developing application that use zlib-ng-compat."
LICENSE = "Zlib"

PV = "2.1.3"

RPM_NAME = "zlib-ng-compat-devel-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "ccc8b28a8a5960f9eb92b7d81097991663ff155021ed4b3c2b9eeff4a456a8cbb28374ab388dd1b280ddfe5b9909599db1dd0bd072dc32cb313a2b53dbe4deeb"

RPROVIDES:${PN} += "pkgconfig-zlib \
zlib-devel \
zlib-ng-compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng-compat1"

inherit rpm
