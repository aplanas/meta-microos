SUMMARY = "Development files for zlib-ng-compat"
DESCRIPTION = "The zlib-ng-compat-devel package contains header files for \
developing application that use zlib-ng-compat."
LICENSE = "Zlib"

PV = "2.1.2"

RPM_NAME = "zlib-ng-compat-devel-2.1.2-2.1.aarch64.rpm"
RPM_HASH = "02e714a6bdabd82f4013b41e2ab898ac2c9ff37755c996b6f669d9432d82307d4aa156ff4a0ba1b696b1fee98be44f1ed081842359f4e6d45de35524223747cb"

RPROVIDES:${PN} += "pkgconfig-zlib \
zlib-devel \
zlib-ng-compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng-compat1"

inherit rpm
