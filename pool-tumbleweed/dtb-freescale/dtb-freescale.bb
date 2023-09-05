SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-freescale-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "18a28ec29c544bedf2492dfff1fdb0361b7e684497d98843359b31e832d9289e6cba34bb0e475ef1369c3f9bc6cb7835c8013128dea3921f70429d24e24fc39d"

RPROVIDES:${PN} += "dtb-freescale \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
