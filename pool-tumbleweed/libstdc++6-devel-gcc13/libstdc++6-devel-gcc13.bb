SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libstdc++6-devel-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "41742235daac8aeb837ddc5944e87c99771663bf429c2ca9844fc0afd4da57fc347f1c4c0cfc252792bc3697f2694bf039de4218b5638fad5f17cf8743a70657"

RPROVIDES:${PN} += "libstdc++6-devel-gcc13"

RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
