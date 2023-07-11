SUMMARY = "Development files for the ELL wireless setup/crypto library"
DESCRIPTION = "The 'Embedded Linux Library' implements an API for wireless \
cryptography actions by using the kernel crypto API. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of ell."
LICENSE = "LGPL-2.1-or-later"

PV = "0.57"

RPM_NAME = "ell-devel-0.57-1.1.aarch64.rpm"
RPM_HASH = "71ff48f27df1d3eaf864982e110aeaf06154348d2afb9b3766b410c90e62e091d859f1418d63a131c14ec5e64c958ea233833c8f29b57b41000de719ed749c06"

RPROVIDES:${PN} += "ell-devel \
pkgconfig-ell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libell0"

inherit rpm
