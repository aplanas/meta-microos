SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-amlogic-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "e2154144dd318e993b2b616b2e743aa7438c9e8f6fe2ce474687bd0df53d1a3b9e34a6122c773a693cf136c7f90e69c56f0a970c5d217505a225fbf456c42bda"

RPROVIDES:${PN} += "dtb-amlogic \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
