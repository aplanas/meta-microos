SUMMARY = "Development files for libtinyxml"
DESCRIPTION = "The libtinyxml-devel package contains libraries and header files for \
developing applications that use libtinyxml."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.2"

RPM_NAME = "tinyxml-devel-2.6.2-10.8.aarch64.rpm"
RPM_HASH = "5443596bc7b8728197231d7993a0a9a64e69969a185edc41f1dadb97125f914d0d6b43631afdd968f34082108596a242b858ea4f3c58b6284a49dc92bd05ea52"

RPROVIDES:${PN} += "libtinyxml-devel \
tinyxml-devel"

RDEPENDS:${PN} += "libtinyxml0"

inherit rpm
