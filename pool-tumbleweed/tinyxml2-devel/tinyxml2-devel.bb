SUMMARY = "Development files for libtinyxml2"
DESCRIPTION = "Contains libraries and header files for \
developing applications that use libtinyxml2."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.0"

RPM_NAME = "tinyxml2-devel-9.0.0-1.8.aarch64.rpm"
RPM_HASH = "fa2b4b5e1e88099d17a4ca509ab232224fa1e612dfb67f67a3a9fa951fc6e27177537110fa209288d87caeb5bcdcf5d0862bcacdf6894f2b5ff0686b4cd81326"

RPROVIDES:${PN} += "cmake-tinyxml2 \
pkgconfig-tinyxml2 \
tinyxml2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinyxml2-9"

inherit rpm
