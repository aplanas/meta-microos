SUMMARY = "Kernel firmware files for various USB WiFi / Ethernet drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various USB WiFi / Ethernet drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-usb-network-20230724-1.1.noarch.rpm"
RPM_HASH = "44001c7da7de92a847591527bda583ddd37724fc20804daccb77359b02a5cb40185de5835e01288f8eff9f703b92e572f8f0c2358f11556613407a954f6eeac8"
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

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
