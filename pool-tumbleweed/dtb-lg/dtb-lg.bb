SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-lg-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "f53794f3ab2d139c1155e4dd9f7aaff3a8a3e517aae78d7ceccf2f7516074af6bdead71b3f43f2db658c531b755cd6f636d025ea3f4de9cc6ebb14e432fd4a73"

RPROVIDES:${PN} += "dtb-lg \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
