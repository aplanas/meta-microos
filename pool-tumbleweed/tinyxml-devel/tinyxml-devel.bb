SUMMARY = "Development files for libtinyxml"
DESCRIPTION = "The libtinyxml-devel package contains libraries and header files for \
developing applications that use libtinyxml."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.2"

RPM_NAME = "tinyxml-devel-2.6.2-10.9.aarch64.rpm"
RPM_HASH = "e58c5c15b3c5d77ef9054a067f3a50f0ce35b384d8e0d8ca18106b58c3868b550df33dd3f59647d70833cc891ed5b86e29d9d7ce428958aa61c4abc73ec0dba1"

RPROVIDES:${PN} += "libtinyxml-devel \
tinyxml-devel"

RDEPENDS:${PN} += "libtinyxml0"

inherit rpm
