SUMMARY = "Development files for the gmp-ecm package"
DESCRIPTION = "This package contains header files required when building applications which \
use the libecm library."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "gmp-ecm-devel-7.0.5-1.4.aarch64.rpm"
RPM_HASH = "4fe17bf09dd299bfcbe644bae933ab06b5d9859e637fe29fcc0fbd68e26fb220574fc85deb7cf9e0d250c9df2d93b030706e7e11d54dd379082a0acb5459cbbd"

RPROVIDES:${PN} += "gmp-ecm-devel"

RDEPENDS:${PN} += "libecm1"

inherit rpm
