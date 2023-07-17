SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Development files (C/C++) for the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-devel-9.6-2.1.aarch64.rpm"
RPM_HASH = "5ed34d2397b0f471567b9b7d1f00f4b7e2d173bcbbf0a560cb23ab67844c72ff69ac09bd8e90b30b375ba78a90e91e4eef2055ec81172787c849673d4c6e061a"

RPROVIDES:${PN} += "cmake-ortools \
google-or-tools-devel"

RDEPENDS:${PN} += "libortools-flatzinc9 \
libortools9"

inherit rpm
