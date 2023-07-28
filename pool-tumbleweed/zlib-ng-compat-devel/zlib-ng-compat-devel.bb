SUMMARY = "Development files for zlib-ng-compat"
DESCRIPTION = "The zlib-ng-compat-devel package contains header files for \
developing application that use zlib-ng-compat."
LICENSE = "Zlib"

PV = "2.1.3"

RPM_NAME = "zlib-ng-compat-devel-2.1.3-1.1.aarch64.rpm"
RPM_HASH = "ea3b69eed3cbc382b2aa461685d38a44fbb53c2fc3468a5eca8d5a8be44c0662d4a20b723eaf46ec0cce6cf3f752d2b486895c7f3a4f4ef6d63dfe9e8b4caf65"

RPROVIDES:${PN} += "pkgconfig-zlib \
zlib-devel \
zlib-ng-compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng-compat1"

inherit rpm
