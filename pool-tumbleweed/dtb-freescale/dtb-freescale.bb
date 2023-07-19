SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-freescale-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "84f4d076a042806353fa79a5a91ba58dc413f5743f8514d5553af101cde664ae25990164f9207294936226ab1c818d37a5d579cee57a3e105ec888aba85cf3f3"

RPROVIDES:${PN} += "dtb-freescale \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
