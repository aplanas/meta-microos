SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-cavium-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "da76d2ed25c0ca0a55884919050ba621aca75d91c68294df08e4312bffbcdf39c1f53882d475e2f72870f1bc2280c39a2d47fbf7fcbce76b75ea27a0a1a03476"

RPROVIDES:${PN} += "dtb-cavium \
dtb-thunder-88xx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
