SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-nvidia-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "8ae55e0bdb5a194063be3b3209595f3fe1a91764615f0e942b5f133ec62e7f87fb14910e2a56c00df7e4ee6b6df9392e32f408e006b462513f1129dd0b293348"

RPROVIDES:${PN} += "dtb-nvidia \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
