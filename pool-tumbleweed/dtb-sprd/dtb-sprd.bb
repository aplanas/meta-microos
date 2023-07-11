SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-sprd-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "6b96d4186faf5b816f6e15d30e6cab6ee86ac08a24811af00ac964db9dc6d687f74eb5d964541c2ebe84e3d4e483d65bf79d862c143e2cd74bcd539042f7096c"

RPROVIDES:${PN} += "dtb-sprd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
