SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libstdc++6-devel-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "e982d33aca6ad13a45cea5fc7f02c1655a4fd2d997e7cee0311b5e01d2d006500259e1a9770e17b37ff986209d81871d0d7438723781a7db1c104a6f2cc60a5f"

RPROVIDES:${PN} += "libstdc++6-devel-gcc13"

RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
