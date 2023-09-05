SUMMARY = "Development files for the ELL wireless setup/crypto library"
DESCRIPTION = "The 'Embedded Linux Library' implements an API for wireless \
cryptography actions by using the kernel crypto API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of ell."
LICENSE = "LGPL-2.1-or-later"

PV = "0.58"

RPM_NAME = "ell-devel-0.58-1.1.aarch64.rpm"
RPM_HASH = "41410e9dd46ef39a0732b64bc2dc7d1cf45e48b38909614b5ba98385573035b9ceef4e97eeb5d3c453e442ef4a7e475c70ca5e0c22c8a218c850d3bc60ffbcad"

RPROVIDES:${PN} += "ell-devel \
pkgconfig-ell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libell0"

inherit rpm
