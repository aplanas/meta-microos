SUMMARY = "SSH library development headers"
DESCRIPTION = "Development headers for the SSH library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libssh-devel-0.10.5-1.2.aarch64.rpm"
RPM_HASH = "db2fc5e1b0f6059fe01eb3135654fa6a0e3470a7e6303b1eeb4cb58363ad9955d58aecb06602f0a8f8864b53aae7519ee6cfaa925260d613ed03c7cc8899efd6"

RPROVIDES:${PN} += "cmake-libssh \
libssh-devel \
pkgconfig-libssh"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libssh4"

inherit rpm
