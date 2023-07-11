SUMMARY = "Kernel firmware files for Cavium LiquidIO driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Cavium LiquidIO driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230620"

RPM_NAME = "kernel-firmware-liquidio-20230620-1.1.noarch.rpm"
RPM_HASH = "8911d0f42fe75fecc1079892d8519660c7246889479b710d414137f70b671a815517d82c2b9ab26139e5ef6ea8e5b41491eea92fd6ca354a0b4569183123ed85"
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
