SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-renesas-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "9c2895ae06be408d1c096f3a0068e8e6596b23989eb329f2ee815b552f3ff1d55fe1b932910379ada1542808f2009c9f192fd0e3b6dacfc809883032ee83243c"

RPROVIDES:${PN} += "dtb-renesas \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
