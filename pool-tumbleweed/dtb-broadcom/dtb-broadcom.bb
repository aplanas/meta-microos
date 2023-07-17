SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-broadcom-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "3a8dac015f62be033fcff36581a716e970fea81cb405444718063fe3806ca644e2e6f94032e853d0302ad274fd36edfceb8b3a001ec785b9454117704c282b6b"

RPROVIDES:${PN} += "dtb-broadcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
