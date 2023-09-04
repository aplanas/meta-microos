SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-socionext-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "114fab55e02f882eee1b1430a310a3590e340cef8812c72cbf357389396d45b1aa89066168b448a57e05aced0b33bc4b15f6a14f87a612517073e1bdad15af03"

RPROVIDES:${PN} += "dtb-socionext \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
