SUMMARY = "Development files for libnk2"
DESCRIPTION = "libnk2 is a library to access Outlook's Nickfile (NK2) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnk2."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-devel-20221122-3.6.aarch64.rpm"
RPM_HASH = "382ea9fa95661e75866ee9eae7c3a5d9b444a7452e08870d239731b08da7936e1b38e5326c8ff37828ae5ce34b5bed0f2bc1598a0ec8ce7e749f7f80fa65bf43"

RPROVIDES:${PN} += "libnk2-devel \
pkgconfig-libnk2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libnk2-1"

inherit rpm
