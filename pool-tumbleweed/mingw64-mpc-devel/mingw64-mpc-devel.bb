SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. This \
package contains the library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-mpc-devel-1.0.2-3.3.noarch.rpm"
RPM_HASH = "eb475aecf4d6f30db7fae6dee388b5b0aa5cca06984f55151bc7a168283183c9226fb9d906699771c660013c49dcbd80efe7c43a0100b206f604bafe15708ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-mpc \
mingw64-mpc-devel"

RDEPENDS:${PN} += "mingw64-lib-mpfr"

inherit rpm
