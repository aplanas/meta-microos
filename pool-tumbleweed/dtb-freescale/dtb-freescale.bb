SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-freescale-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "f340ee6fbae9b5b5cf7a05a12254560485a45c1e6a44d118d1ec1c26cd97f57e862b09d8ac5063bee406cb0c00d27aadf40810dccc25ef979305d979a0b5e363"

RPROVIDES:${PN} += "dtb-freescale \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
