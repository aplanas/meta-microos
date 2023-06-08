SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-freescale-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "eca3d661b089e054a5bac354062f597ed783a7f046ce3088cea2ad011a79c3b4ce361be12bce409209fa3c9e509d9f7721f3674a632f143dedb165e5492eb834"

RPROVIDES:${PN} += "dtb-freescale dtb-freescale(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
