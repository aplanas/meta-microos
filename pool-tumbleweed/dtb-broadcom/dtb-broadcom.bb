SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-broadcom-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "5f76ceea7aeaa3d9fd63a9ffec75e77ddde83d9ce144389769ec7a8afe6263a425370d4ba5c798cac2ff58614986e21c7e40b805d1262c9c718bf781e9a8250a"

RPROVIDES:${PN} += "dtb-broadcom \
dtb-broadcom(aarch-64) \
multiversion(dtb)"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
