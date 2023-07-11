SUMMARY = "Development files for the libdat and libdapl libraries"
DESCRIPTION = "Library links and header files for the libdat and libdapl libraries. \
 \
The libraries have tracing enabled."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-devel-2.1.10-5.2.aarch64.rpm"
RPM_HASH = "1c03f247fe690fdd120128c578e47562dbd0b338870bc276104d59500e47ec9be7d129537f8d28536baf106a9c0de40565b5df7121353d59458b8bb5db1695cc"

RPROVIDES:${PN} += "dapl-debug-devel"

RDEPENDS:${PN} += "dapl-debug \
glibc-devel"

inherit rpm
