SUMMARY = "Development files for the libdat and libdapl libraries"
DESCRIPTION = "Library links and header files for the libdat and libdapl libraries."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-devel-2.1.10-5.2.aarch64.rpm"
RPM_HASH = "6462e0c3e803dc9fc81894d8e0fe198b74e9c7720e6838cd0e77a53b11eeda228e6a9d35763ec4aebbbdab8eaf873c5819500e3c3e08ba9ba2f3a4e7faca630e"

RPROVIDES:${PN} += "dapl-devel"

RDEPENDS:${PN} += "dapl \
glibc-devel"

inherit rpm
