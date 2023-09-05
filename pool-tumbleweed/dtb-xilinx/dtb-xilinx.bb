SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-xilinx-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "1077f6876430a77ab4420fc97a80c25a24dccbfac6b71601f8c0653611180b20bce7678bb19f0111ba25c2a8ad7c9c33243b5ee9f48eb85fe041eb860c31c187"

RPROVIDES:${PN} += "dtb-xilinx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
