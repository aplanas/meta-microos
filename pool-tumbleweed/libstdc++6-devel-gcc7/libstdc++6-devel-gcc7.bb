SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-devel-gcc7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "4f1d00a89e432aab09d6210f138cb1f6622a6d293478d7e00ae7d9cebd578db6fd16bb5cc632e1bcb7b7112e6519147272283d37bd216797f4ce3308791c9fbd"

RPROVIDES:${PN} += "libstdc++6-devel-gcc7"

RDEPENDS:${PN} += "glibc-devel \
libstdc++6"

inherit rpm
