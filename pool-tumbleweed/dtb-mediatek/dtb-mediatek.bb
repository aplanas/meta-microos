SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-mediatek-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "258c9e30bc5fa723b7124ea6cd5c7ff0c1a215e5c9cc142f125f42316bb6288a16dae112b3d506af2f72cd382a96477b578a848c12b76cac7c8dccd649aee225"

RPROVIDES:${PN} += "dtb-mediatek \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
