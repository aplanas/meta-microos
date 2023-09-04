SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-sparc64-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "497ec615b4af44dedb7f033b3b36b9245e9c2c1f7b1259e7fa2afe1f90086ed87345dcd8196f195c70456446268a7e71a4e910a729df29c575d4ae066587aad8"

RPROVIDES:${PN} += "cross-sparc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
