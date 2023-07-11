SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-freescale-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "dd54deb654e4420fd176dc558bf6d396824aca9570314a7e019917ebafd354428fe0ed9b1c966abbbcdaaf34fc37d1a15f25fb83e60889dfec5898de359b8bc0"

RPROVIDES:${PN} += "dtb-freescale \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
