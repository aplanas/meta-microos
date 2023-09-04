SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-freescale-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "727dcaba01216a5bc956dbb92364e8c1ad9fcdb3ed54b9820c228eba3ca46117edb5b4ac643b2089e81c6cd691d9c6c52c56f8823c8ece193fca4d1f79cc6ccd"

RPROVIDES:${PN} += "dtb-freescale \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
