SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-lg-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "4498409052d2bfcb8ebcdf86bcf99b60b046a9d9085db087394ef14f1f911baeba87cff79335bd417c1638df694806d7cb96a1967a53e0e55f2010ed9ead352b"

RPROVIDES:${PN} += "dtb-lg \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
