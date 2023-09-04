SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-xilinx-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "0a1e0766338f7abbff0aee69b5d1b2c582456df4a297b936dcd14e91140bab191046b9121ff5a1a85cce69243ec29fcd09133f5ba86562ab6faabf64ae703423"

RPROVIDES:${PN} += "dtb-xilinx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
