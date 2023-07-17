SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-cavium-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "265c5de9a8adbe0bc369f738b3d529206bd675e1394251b18d7e27643a34fcb81c323e5a3e778f4d33e1ee953a68089735b2972823ee98331dbef3848cb25625"

RPROVIDES:${PN} += "dtb-cavium \
dtb-thunder-88xx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
