SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Development files (C/C++) for the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-devel-9.6-3.2.aarch64.rpm"
RPM_HASH = "e9e7a55b25b03921ea91bb8eeaee6b2a2b5d717717123e6434d3fb44657ea0b1cef7104160ef5a82967af9313e7eae1a1c5d9b2e3aa3fbc780fb70ebdaa7412b"

RPROVIDES:${PN} += "cmake-ortools \
google-or-tools-devel"

RDEPENDS:${PN} += "libortools-flatzinc9 \
libortools9"

inherit rpm
