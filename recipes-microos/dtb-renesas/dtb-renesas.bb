SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-renesas-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "865d59b262c1b3414237046f83b79a299d0b652d3b38bdb30a87bbbb2ea8d239db61188a73ea2d04b96c67986957c5a16b5d23aa582daff7c381779c99a4193f"

RPROVIDES:${PN} += "dtb-renesas dtb-renesas(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
