SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-renesas-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "63753b797029106ec3957f434cec9c4523d588f20875f5b940428f272d9f48aab224626f00a93d236e5db05663af47fecaa90dab17aa85c7f130e01f18778f65"

RPROVIDES:${PN} += "dtb-renesas \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
