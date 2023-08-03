SUMMARY = "Development files for Unified Communication Protocols (UC-P)"
DESCRIPTION = "High-level API uses UCT framework to construct protocols commonly \
found in applications (MPI, OpenSHMEM, PGAS, etc.)"
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "libucp-devel-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "751a376d21bba465e26476455d3081a075e6123f4b02892a65c1793880bb8539ed3027c0addfbcfc52ecd352f3242ef0d546591e0e4534315692e5670d8ce36d"

RPROVIDES:${PN} += "libucp-devel"

RDEPENDS:${PN} += "libucp0"

inherit rpm
