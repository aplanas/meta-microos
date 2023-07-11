SUMMARY = "Development headers for perf"
DESCRIPTION = "Development headers for perf. This is currently only dlfilter header."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "perf-devel-6.3.9-80.8.aarch64.rpm"
RPM_HASH = "c13ebb43f88972da2f336de19572f1697c3dc5e8065ca65c7f4cbc79434b26c83897585c745141cd17b27275e29dd6a9a6c40f0da09123845eaa7b9c362391a7"

RPROVIDES:${PN} += "perf-devel"

RDEPENDS:${PN} += "perf"

inherit rpm
