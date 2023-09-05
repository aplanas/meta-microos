SUMMARY = "Kernel firmware files for Marvell WiFi fullmac drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell WiFi fullmac drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-mwifiex-20230829-1.1.noarch.rpm"
RPM_HASH = "368a21f1054d5f8e69d21d294e01c44c8c420c712b56833ec20e552b4bc1940b4811f0f0a5e05bdce3ca401392c35d688cf056a78651b9debbff290807189509"
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
