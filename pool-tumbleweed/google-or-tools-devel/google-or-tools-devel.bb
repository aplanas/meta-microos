SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Development files (C/C++) for the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-devel-9.6-1.2.aarch64.rpm"
RPM_HASH = "4bcc6979f304b76e302b2390578a7a36266f2baa51e4842f26859fc1d88001534f05991c44bf536bbd63c42a88e0ed013e87d7ad540322720d337af49e5f7863"

RPROVIDES:${PN} += "cmake-ortools \
google-or-tools-devel"

RDEPENDS:${PN} += "libortools-flatzinc9 \
libortools9"

inherit rpm
