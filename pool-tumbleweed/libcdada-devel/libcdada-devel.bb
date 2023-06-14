SUMMARY = "Development files for libcdada"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libcdada."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "libcdada-devel-0.4.0-1.6.aarch64.rpm"
RPM_HASH = "dd508ad89e9922d6caac4ad688601b492954306975d4d60e478e73638dc4f9d0235ef03750e443de940c851cb3e240963b6d79dcd651e2d7252e47f072f7772d"

RPROVIDES:${PN} += "libcdada-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
libcdada0 \
python3"

inherit rpm
