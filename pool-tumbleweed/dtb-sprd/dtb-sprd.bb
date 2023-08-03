SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-sprd-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "19b8f8b84c29d93801ac1180fd343685940e08ed643001e168d4a35f8b6447831c9bd9723897b9885f4ef521c5f5e65fc3763a4a9a9b5c2a6cece8de63c8fa12"

RPROVIDES:${PN} += "dtb-sprd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
