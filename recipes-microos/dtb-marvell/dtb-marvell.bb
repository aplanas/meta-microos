SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-marvell-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "dbbbb62fd864b510e458e0313f17dcce991a9c57033655b7390b99b8c980da5af43831cf52abf7b6023489ddbd3e8822c082216218a3cc9a9316c731070a157e"

RPROVIDES:${PN} += "dtb-marvell dtb-marvell(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
