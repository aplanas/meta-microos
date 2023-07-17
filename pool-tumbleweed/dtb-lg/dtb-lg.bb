SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-lg-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "57830e84ce8b7d850d530a9899b87c8ef5d5214e440024219ef03633066973a353710ed70204d775581bb988b60f125e739d22aa1aba13e65e04af346957d889"

RPROVIDES:${PN} += "dtb-lg \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
