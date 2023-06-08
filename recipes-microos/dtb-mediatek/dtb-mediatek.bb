SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-mediatek-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "eddc62925998665fe16dadc6d08bb40cd9ec6d141f1c786d54683b3fa7bb64cf02ba6347c41dd827e333f8f74cbad45cde42dae6c4c9b87c6cea01bc4e723554"

RPROVIDES:${PN} += "dtb-mediatek dtb-mediatek(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
