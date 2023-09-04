SUMMARY = "Kernel firmware files for various USB WiFi / Ethernet drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various USB WiFi / Ethernet drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-usb-network-20230814-1.1.noarch.rpm"
RPM_HASH = "26af2a321e97d0a15fbcacd1da0e99264423032178e7cfa30cd34902f5b08a5c16d27c1e072605b91b8e5a0bf2493f3b57d348ba9a24446c0d257eaa8e06e1db"
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
