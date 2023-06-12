SUMMARY = "Kernel firmware files for Cavium LiquidIO driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Cavium LiquidIO driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-liquidio-20230517-1.1.noarch.rpm"
RPM_HASH = "03c1f87d4dd32888c54126ce1d538a8f5e391bc24c5f2622017a6aa82d55b2fcecc490ee13bb274197a9c0d65f5db64428b0a904e1302d3ea0be951f1e2e8fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(liquidio/lio_210nv_nic.bin) \
firmware(liquidio/lio_210sv_nic.bin) \
firmware(liquidio/lio_23xx_nic.bin) \
firmware(liquidio/lio_410nv_nic.bin) \
kernel-firmware-liquidio"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm