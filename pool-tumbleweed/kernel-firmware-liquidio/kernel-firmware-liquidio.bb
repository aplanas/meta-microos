SUMMARY = "Kernel firmware files for Cavium LiquidIO driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Cavium LiquidIO driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-liquidio-20230707-1.1.noarch.rpm"
RPM_HASH = "39b901a57ebfc56b5f71dcbc90ecca9bdcb7f7f806b4974e8e11d47232518502d7eb345b9e33d6b68e0d97d03efd328cc0acb3248b449bf0e27dc056c1416ff9"
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
