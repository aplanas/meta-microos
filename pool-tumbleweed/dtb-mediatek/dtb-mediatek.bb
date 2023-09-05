SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-mediatek-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "114313796c6149ebf34179fcdbdf9a71be3fbf85db6236ea27eb1a88e77a9b33ae4df4a75522be38304701d0c878c678ef5194cdb39ce22da0c409dcf78add96"

RPROVIDES:${PN} += "dtb-mediatek \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
