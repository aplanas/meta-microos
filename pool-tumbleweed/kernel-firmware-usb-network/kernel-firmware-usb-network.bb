SUMMARY = "Kernel firmware files for various USB WiFi / Ethernet drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various USB WiFi / Ethernet drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-usb-network-20230517-1.1.noarch.rpm"
RPM_HASH = "baf80cefd7d9eec1c9546fbfba03f1d045729ee5c7133c68dd5f213b74f70234df1d6936b6301f4f443a619cb646c4d1225fafa5cd72ba425875adff64e69ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-atusb/atusb-0.2.dfu \
firmware-atusb/atusb-0.3.dfu \
firmware-atusb/rzusb-0.3.bin \
firmware-kaweth/new-code-fix.bin \
firmware-kaweth/new-code.bin \
firmware-kaweth/trigger-code-fix.bin \
firmware-kaweth/trigger-code.bin \
firmware-rsi-91x.fw \
firmware-rsi/rs9113-ap-bt-dual-mode.rps \
firmware-rsi/rs9113-wlan-bt-dual-mode.rps \
firmware-rsi/rs9113-wlan-qspi.rps \
firmware-rsi/rs9116-wlan-bt-classic.rps \
firmware-rsi/rs9116-wlan.rps \
firmware-rt73.bin \
firmware-vntwusb.fw \
kernel-firmware-usb-network"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
