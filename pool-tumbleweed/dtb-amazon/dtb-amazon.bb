SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-amazon-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "e1a164082d2b1c3203a760d85df56eb5da67e656ff9fb2ba76790e3bfd04350dd66c5a8a5c212a22e91b06377435d281f9f0b2d18ba71f51d53d2a5a90a94ae6"

RPROVIDES:${PN} += "dtb-al \
dtb-amazon \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
