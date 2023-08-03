SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-xilinx-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "b85fc0d37e980a1075b4718139aa6b357836587a7434886a4b53ca25a0a683378fd6201cc3b34890623648259f8b621f48156f50cb8610e1380eb68cd26392bb"

RPROVIDES:${PN} += "dtb-xilinx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
