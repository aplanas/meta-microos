SUMMARY = "Filesystem Path Utilities"
DESCRIPTION = "Utility functions to manipulate filesystem pathnames"
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "libpath_utils1-0.2.1-28.1.aarch64.rpm"
RPM_HASH = "8fbf9ddcad94117e58758659c8ecbbac359114a731e6469ae8951a645ab523f5d3706a1a4336d33b8a23e439e75cd501c04f26274c1f89f744dffc39c493bb88"

RPROVIDES:${PN} += "libpath-utils.so.1 \
libpath-utils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
