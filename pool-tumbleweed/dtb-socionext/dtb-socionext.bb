SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-socionext-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "b145eb93f165cfba35f13c8a71b668b5423b7e9bb33c1699b7c69bce8b1b4c9c91a1218bf6f468f18cc03cc2cd6798056fbb716a824dcb8e102d0ace9f2ae153"

RPROVIDES:${PN} += "dtb-socionext \
multiversion-dtb"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
