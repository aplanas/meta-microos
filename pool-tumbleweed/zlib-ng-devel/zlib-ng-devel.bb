SUMMARY = "Development files for zlib-ng"
DESCRIPTION = "The zlib-ng-devel package contains header files for \
developing application that use zlib-ng."
LICENSE = "Zlib"

PV = "2.1.3"

RPM_NAME = "zlib-ng-devel-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "2edc0ec51f3293a9791247221cc15cc3a843256bba35cb8fe51981a7981584635cf79c5e4726868ea03a3bc5c21c4b1e8e7d10ba1a20d3da423c4f93a96a6dea"

RPROVIDES:${PN} += "pkgconfig-zlib-ng \
zlib-ng-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng2"

inherit rpm
