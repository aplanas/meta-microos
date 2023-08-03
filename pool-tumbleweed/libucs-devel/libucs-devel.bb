SUMMARY = "Development files for Unified Communication Services (UC-S)"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "libucs-devel-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "ffa6600ec1685ebbc26629accc24259af852ed6f064989488b657b3b3406c1fc5a68f1f9c3ef5bc9553df151e5e077da78af347935219c9ff2bc862515793631"

RPROVIDES:${PN} += "libucs-devel \
pkgconfig-ucx-ucs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libucs0"

inherit rpm
