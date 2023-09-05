SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-marvell-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "2ff8f9726ddc1e4de7e356c6d35a846abacc52ba884b20815828a6c42a2d27eb4b7d2864451f5c1a872a4829161172e6e33f0ba27a440c87a0bc28e13ee69400"

RPROVIDES:${PN} += "dtb-marvell \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
