SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-freescale-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "3fb44fdc0725d5c16716d13e0dbd4e8b870d5b2027c407b9276af4a8c25e54415d6be55073ff5a4c6e268f659a399fcb26bb7f59407c5e1237ab694beef8f35e"

RPROVIDES:${PN} += "dtb-freescale \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
