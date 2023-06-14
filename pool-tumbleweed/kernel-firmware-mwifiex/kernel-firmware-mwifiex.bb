SUMMARY = "Kernel firmware files for Marvell WiFi fullmac drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell WiFi fullmac drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-mwifiex-20230517-1.1.noarch.rpm"
RPM_HASH = "49899ac47ef3ddb9eee9c89a7b2dc8a7adc7fc6af004e008629df551d03fbc5703e94248ccd2ea9cc5a31bc4cb5956f35f342ea31094607b3ec4ca24fcc5a9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-mrvl/pcie8897-uapsta.bin \
firmware-mrvl/pcie8997-wlan-v4.bin \
firmware-mrvl/pcieuart8997-combo-v4.bin \
firmware-mrvl/pcieusb8997-combo-v4.bin \
firmware-mrvl/sd8787-uapsta.bin \
firmware-mrvl/sd8797-uapsta.bin \
firmware-mrvl/sd8801-uapsta.bin \
firmware-mrvl/sd8887-uapsta.bin \
firmware-mrvl/sd8897-uapsta.bin \
firmware-mrvl/sdsd8977-combo-v2.bin \
firmware-mrvl/sdsd8997-combo-v4.bin \
firmware-mrvl/usb8766-uapsta.bin \
firmware-mrvl/usb8797-uapsta.bin \
firmware-mrvl/usb8801-uapsta.bin \
firmware-mrvl/usb8897-uapsta.bin \
firmware-mrvl/usbusb8997-combo-v4.bin \
kernel-firmware-mwifiex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
