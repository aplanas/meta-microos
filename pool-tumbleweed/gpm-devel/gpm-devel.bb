SUMMARY = "Development files for gpm (Console Mouse Support)"
DESCRIPTION = "Development files for the gpm (general purpose mouse) package."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.7"

RPM_NAME = "gpm-devel-1.20.7-19.15.aarch64.rpm"
RPM_HASH = "9e23d7bc18ca1312842de18d346ce106465c04dc753f8490b8f77f5dfde3b1157e78cf03029e718ff7ffe83d3786a3184d9612d8bd54dbbb15ada4d7edd1e73e"

RPROVIDES:${PN} += "gpm-devel"

RDEPENDS:${PN} += "libgpm2"

inherit rpm
