SUMMARY = "Development files for libtinyxml2"
DESCRIPTION = "Contains libraries and header files for \
developing applications that use libtinyxml2."
LICENSE = "GPL-2.0-or-later"

PV = "9.0.0"

RPM_NAME = "tinyxml2-devel-9.0.0-1.7.aarch64.rpm"
RPM_HASH = "3833467459bd13f4e35b1ea6eb570a9a3a6ca3cdbc9be0fbf30c9d85ee45716605654a3eaedba9f63b79fd125ccc23302de03c670b118013b3fae91352dcfc12"

RPROVIDES:${PN} += "cmake(tinyxml2) \
pkgconfig(tinyxml2) \
tinyxml2-devel \
tinyxml2-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinyxml2-9"

inherit rpm
