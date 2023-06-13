SUMMARY = "A multi-platform, multi-architecture disassembly framework"
DESCRIPTION = "Capstone is a disassembly framework. \
disasm engine for binary analysis and reversing in the security community."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "capstone-4.0.2-2.3.aarch64.rpm"
RPM_HASH = "526e5294024ebce20774a6e0a47df7da6edf154da02766efe77b8004afdbe41bb2752b62e84d8ae3db357985720e1b5bd70e31e85ec2e7b16b2c0958d3a565c6"

RPROVIDES:${PN} += "capstone \
capstone(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
