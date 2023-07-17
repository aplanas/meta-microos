SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-marvell-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "50e863e90e94eb0f6570c029823050ccfec77d433becb88f29208101096726a076d202df260856e83fd4df938c177905b50c224f1136b8e7700ef813a4d2f50b"

RPROVIDES:${PN} += "dtb-marvell \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
