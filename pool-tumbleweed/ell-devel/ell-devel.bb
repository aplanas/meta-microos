SUMMARY = "Development files for the ELL wireless setup/crypto library"
DESCRIPTION = "The 'Embedded Linux Library' implements an API for wireless \
cryptography actions by using the kernel crypto API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of ell."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56"

RPM_NAME = "ell-devel-0.56-1.3.aarch64.rpm"
RPM_HASH = "f4d38f7ce29a3024cf75727f8ae9e91f213e3a8bae1f4a206921f302bca742e0d36faae32265633518c226764e9e88b1a8d37154211c011016e25c0abe674fdb"

RPROVIDES:${PN} += "ell-devel \
ell-devel(aarch-64) \
pkgconfig(ell)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libell0"

inherit rpm
