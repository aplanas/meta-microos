SUMMARY = "Development files for clapper"
DESCRIPTION = "Development files for clapper."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "clapper-devel-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "2daac0765e8eb093d912c73fffe5e913d780e0eedea792293ec1f4f12cda796e2af9474fb2318a31bd382dc4fb689980b98f55deb6180ea3309ff2bd7504cebc"

RPROVIDES:${PN} += "clapper-devel \
clapper-devel(aarch-64)"

RDEPENDS:${PN} += "libgstclapper-1_0-0 \
libgstclapperglbaseimporter0 \
typelib-1_0-GstClapper-1"

inherit rpm
