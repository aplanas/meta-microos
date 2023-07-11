SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-arm-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "3003a0278a26a75003beb01d99a13b36e782cd62166e8fbe0cc7911dc86e8fbff010614bb28bdf878ed9fdb6dd6b5df58f7a3af353e662306d0f6c6aa679ffb7"

RPROVIDES:${PN} += "dtb-arm \
dtb-foundation-v8 \
dtb-rtsm-ve-aemv8a \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
