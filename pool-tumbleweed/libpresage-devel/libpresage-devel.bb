SUMMARY = "Intelligent predictive text entry platform (development files)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains development files. \
 \
This package contains the header files needed to compile applications or shared objects that use libpresage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage-devel-0.9.1-13.2.aarch64.rpm"
RPM_HASH = "14cab8971a490519d5eac8de176f8504187d3a25a39d99f3b25d5a12ff2358db3a5be4908f271d7142c3e4749436c51952757122eda42dfd10ab2da9359597c2"

RPROVIDES:${PN} += "libpresage-devel"

RDEPENDS:${PN} += "libpresage1"

inherit rpm
