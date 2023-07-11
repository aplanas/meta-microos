SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-nvidia-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "dec47188da76d78c9e00dc95a93eb5d63865ef4db3ae88566d32f5a9f14242c53a4462d530abd55f3babcd38945b9e613ba7729b16a9c66ce62fa642c26196d6"

RPROVIDES:${PN} += "dtb-nvidia \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
