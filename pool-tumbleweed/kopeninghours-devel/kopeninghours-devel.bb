SUMMARY = "Development files for KOpeningHours"
DESCRIPTION = "Include files and libraries needed to build programs that use the KOpeningHours \
library."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kopeninghours-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "eac4b728f65e68ece8346e225813bebbe81c9734a2b2a86b06aeefd48b05e5c8269c3001a4abfd136e5fd13aa0a5ca1e05c5f41421b38f6aaaa57d081a581bc5"

RPROVIDES:${PN} += "cmake-KOpeningHours \
kopeninghours-devel"

RDEPENDS:${PN} += "libKOpeningHours1"

inherit rpm
