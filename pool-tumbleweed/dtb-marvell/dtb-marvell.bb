SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-marvell-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "47f9a181dafd5151624f085df195aa0c2afc72843a059c4c217401f8324a63e259b96b44627d8dcee68eeeed5949fe9f2f4f87f8b8f1f9972a1f95dbde3a12bc"

RPROVIDES:${PN} += "dtb-marvell \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
