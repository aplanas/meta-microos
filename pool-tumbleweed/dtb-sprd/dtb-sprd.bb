SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-sprd-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "56a92586aeea55e98802338fdad7c93352ce2bd1fa03db7124db732c8ecfadc43e67e1e3f09e8051c1566cc49ffd7c48c33cd5c7cd1b7dfb889e714ceff65ed8"

RPROVIDES:${PN} += "dtb-sprd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
