SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-marvell-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "e30363cf0daac5331b4d8d1492b6aa10a37f2194df5771ba4ecaf83cecdfd41f913649a3aa769ba75d0f330603ae4c2c8e7f24b5eab8bd0b88c6b9b8eb219f2c"

RPROVIDES:${PN} += "dtb-marvell \
dtb-marvell(aarch-64) \
multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
