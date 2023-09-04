SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-broadcom-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "247bb9262c45ecc8eae0e1cc383df56a3d50b0d4ada8e0b0e744ddfffd0953fe0193b2a2bb7040d60f3eaedf330e8a270d529267f90d75ae50fb9b796373ee40"

RPROVIDES:${PN} += "dtb-broadcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
