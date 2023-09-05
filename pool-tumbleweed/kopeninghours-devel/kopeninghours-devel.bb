SUMMARY = "Development files for KOpeningHours"
DESCRIPTION = "Include files and libraries needed to build programs that use the KOpeningHours \
library."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kopeninghours-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b4c68da25290acacf6e2b33fa3639152dcd8300aea953a551c169f41fdc57a83df444666302f7d31106789008be709827fa1cd939d61153cb859ba9a07e4c126"

RPROVIDES:${PN} += "cmake-KOpeningHours \
kopeninghours-devel"

RDEPENDS:${PN} += "libKOpeningHours1"

inherit rpm
