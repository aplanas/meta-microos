SUMMARY = "Kernel firmware files for Cavium LiquidIO driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Cavium LiquidIO driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-liquidio-20230814-1.1.noarch.rpm"
RPM_HASH = "c4234adf963401359405b7f8de0a443a2a2d0abed4e1654c161690dbbad8eeb22f9f6a84ddedc29d67e5dfd3a13adfe422e63c302764873cea88785796f36dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-liquidio/lio-210nv-nic.bin \
firmware-liquidio/lio-210sv-nic.bin \
firmware-liquidio/lio-23xx-nic.bin \
firmware-liquidio/lio-410nv-nic.bin \
kernel-firmware-liquidio"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
