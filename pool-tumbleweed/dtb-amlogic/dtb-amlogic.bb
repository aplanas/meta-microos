SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-amlogic-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "2be8f39bdd4813afa5f902628cadd9b664dbe7034d528fbadabb8ba83cf426b7e337191e8b6a3c8b0b72ee925848bb115290ea24cc0a005b11832e1599c778c6"

RPROVIDES:${PN} += "dtb-amlogic \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
