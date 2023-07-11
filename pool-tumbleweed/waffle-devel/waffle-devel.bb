SUMMARY = "Libraries, includes and more to develop Waffle applications"
DESCRIPTION = "Devel files for the waffle C library. Libraries, includes and more to \
develop Waffle applications."
LICENSE = "BSD-2-Clause"

PV = "1.7.2"

RPM_NAME = "waffle-devel-1.7.2-1.4.aarch64.rpm"
RPM_HASH = "df60caaa1b63bde1a043964e3c49437586e87b767fecf6a9a247d46dfeb0405ba3190ed62ac41c9790c6b4eb7e42db2ce1e687ec1e31d519f9f18b218eaddcfb"

RPROVIDES:${PN} += "cmake-Waffle \
pkgconfig-waffle-1 \
waffle-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwaffle-1-0"

inherit rpm
