SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-renesas-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "442d6c68b970cb5f16b8073ebad7ef142f5c20da0abe81600b230e6c64d82708b941116704a9d85e486c0b00dfd1bc86b99f4a8626fa04001ebb19780dedc52e"

RPROVIDES:${PN} += "dtb-renesas \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
