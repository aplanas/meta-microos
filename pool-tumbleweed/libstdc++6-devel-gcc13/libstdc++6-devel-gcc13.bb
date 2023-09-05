SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libstdc++6-devel-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "d9c92a88fbdf3ccda17156e72185dbec8984b6223048248492c610dee1a4f1d8d7d5bfc42ee6e729b4be7d2b1884945238be41ac0442d6a49a37bea8b978ba97"

RPROVIDES:${PN} += "libstdc++6-devel-gcc13"

RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
