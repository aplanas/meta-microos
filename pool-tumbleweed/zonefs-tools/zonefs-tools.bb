SUMMARY = "Utilities for the Zonefs filesystem"
DESCRIPTION = "Utilities needed to create and maintain zonefs file systems under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "zonefs-tools-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "92f56a4066e4b2658c30a762fe5166fc31cbd418d9ade9e84a6e85de0a62286b86cdbf69fdd1785cb42b1abf80577acf6f2f1f9c3db31c9872f863780a2aa6d6"

RPROVIDES:${PN} += "zonefs-tools \
zonefs-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
