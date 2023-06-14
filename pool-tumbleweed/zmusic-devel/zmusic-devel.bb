SUMMARY = "Headers for the ZMusic library"
DESCRIPTION = "This subpackage contains the headers for the zmusic library, which is ZDoom's \
music component library."
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "zmusic-devel-1.1.11-2.2.aarch64.rpm"
RPM_HASH = "e62795a713c8c4055121d5345c0a082d0f9b0d8f99f87e1649fe7a72abe39cdd446b4ed0acd343e92463e263e5d9a19af5e0a939fd84d32208aaf98e163d3ec8"

RPROVIDES:${PN} += "cmake-ZMusic \
zmusic-devel"

RDEPENDS:${PN} += "libzmusic1"

inherit rpm
