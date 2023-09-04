SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Development files (C/C++) for the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-devel-9.6-3.1.aarch64.rpm"
RPM_HASH = "d6e5b1708bf9981b41ad0bca7ed774331d80d8c6d89a12717982ace385bf43b4a02230823e8fad72656696955d1e2fca3a4b22530aa2c032ce19b7c555b99718"

RPROVIDES:${PN} += "cmake-ortools \
google-or-tools-devel"

RDEPENDS:${PN} += "libortools-flatzinc9 \
libortools9"

inherit rpm
