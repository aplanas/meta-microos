SUMMARY = "Development files for Unified Communication Protocols (UC-P)"
DESCRIPTION = "High-level API uses UCT framework to construct protocols commonly \
found in applications (MPI, OpenSHMEM, PGAS, etc.)"
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucp-devel-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "99f9454edf58878881e21e59778451e583d6ddc97ba70e8047e1a26adc560d5a16ec15d33f8d1cd72605792985fbd4180225350f17f1a71fd2f15cee341de900"

RPROVIDES:${PN} += "libucp-devel"

RDEPENDS:${PN} += "libucp0"

inherit rpm
