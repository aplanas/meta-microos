SUMMARY = "Development files for Unified Communication Protocols (UC-P)"
DESCRIPTION = "High-level API uses UCT framework to construct protocols commonly \
found in applications (MPI, OpenSHMEM, PGAS, etc.)"
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucp-devel-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "708de880b53aa9d10b16e40c56f1bdeceda116843ee7494dd400c0ad6f12815fc5ab618cf8bf7dfeed5035592324f24eedf55566fbdc85b34b4085411a18a3be"

RPROVIDES:${PN} += "libucp-devel"

RDEPENDS:${PN} += "libucp0"

inherit rpm
