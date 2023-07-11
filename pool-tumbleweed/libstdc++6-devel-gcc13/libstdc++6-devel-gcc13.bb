SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libstdc++6-devel-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "020fdabe6178f4487ea3ff0741943d432203f7d7a8fb2148fc1afd1d86c9c8740e44c482fd529e562ec0f5abbfe197556d9fc9fda0a9902c1061dbc043bc293a"

RPROVIDES:${PN} += "libstdc++6-devel-gcc13"

RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
