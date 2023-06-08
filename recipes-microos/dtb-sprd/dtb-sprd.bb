SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-sprd-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "a777cbb898563c47f9739874bacb17fa769201f369a3be39731330d29377eaf4af8aa00ea1e13cd15655fe7b81bc8485bd21ee71a81fdfcd1ef389dc23df35d0"

RPROVIDES:${PN} += "dtb-sprd dtb-sprd(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
