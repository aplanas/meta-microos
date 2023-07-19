SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-amlogic-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "1bda284660dcdefd76c3aab8802c0b3fc72b962cd9daef251d5f715124761a326c1d21b31bc9c04c537b422758c8df043d09b9c97e796f1bf2e9c9cca237dd53"

RPROVIDES:${PN} += "dtb-amlogic \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
