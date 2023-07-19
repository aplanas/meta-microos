SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-xilinx-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "a355b4e7422a2d9332294d79ec2bd34cf025679761c2b4708e25a6e63d3921fef1ddcd5a51b73527086acf36ed81cb99d169a840be22b970db9c1f85b68b999e"

RPROVIDES:${PN} += "dtb-xilinx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
