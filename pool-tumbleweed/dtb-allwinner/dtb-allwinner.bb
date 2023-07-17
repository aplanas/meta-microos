SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-allwinner-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "1acfd8608cc0857b3be57d6130ecbea692f5871050a6a9f0f9be719bba10454c76e68083f0fd73505001572db4835cb930dd059c1031f186b6833ea7373b7b4f"

RPROVIDES:${PN} += "dtb-allwinner \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
