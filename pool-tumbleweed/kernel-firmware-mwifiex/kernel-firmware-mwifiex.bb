SUMMARY = "Kernel firmware files for Marvell WiFi fullmac drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell WiFi fullmac drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-mwifiex-20230707-1.1.noarch.rpm"
RPM_HASH = "25c294859fb4ce03d61bbd2af7f4be0868a4b03f805ef9ec7fbace68e41c68b0a7fda4db45cdcd164bd4faf732624ccb90de3280c1cf721e90556d03e60bdb97"
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

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
