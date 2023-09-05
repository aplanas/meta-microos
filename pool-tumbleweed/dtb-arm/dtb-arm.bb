SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-arm-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "dfc16c22d5e64d761fa7c8d5cc14ea6d542edff3a9fe65af26b74fc8b6de73b343b8d89e997dcfad3e6fb281ad40df8909783eb52edacf2f33192d382cc9c40a"

RPROVIDES:${PN} += "dtb-arm \
dtb-foundation-v8 \
dtb-rtsm-ve-aemv8a \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
