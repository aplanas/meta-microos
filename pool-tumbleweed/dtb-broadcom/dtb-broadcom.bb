SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-broadcom-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "862304608ce49d1efbcd49e98b0d0a666ad0a708d08c1eb779b735a875857e2bb7f43ddbfcd4b7c8c59f91f7614800865823e717cd3ffc95d0d3d88039debfa7"

RPROVIDES:${PN} += "dtb-broadcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
