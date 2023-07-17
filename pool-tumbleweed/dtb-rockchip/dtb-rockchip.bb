SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-rockchip-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "d7a9580a35d66abcaef96ad245c03890e953bf3eb33478c7a1dea1d493b48b21d4f03840006c4a09ad870ae91a52fe3878d6e38ce2a550e90e81f1f85f9f6c8f"

RPROVIDES:${PN} += "dtb-rockchip \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
