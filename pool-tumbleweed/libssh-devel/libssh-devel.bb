SUMMARY = "SSH library development headers"
DESCRIPTION = "Development headers for the SSH library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh-devel-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "b8b885a108e6dca9b8f319e03fe4d4de76292e0c6a8141df8cfa2cb2184151035e1f26e48e92d811f132b115d235716c21d3205739d535205ed4024481ee2a12"

RPROVIDES:${PN} += "cmake-libssh \
libssh-devel \
pkgconfig-libssh"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libssh4"

inherit rpm
