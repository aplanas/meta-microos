SUMMARY = "Firmware for BCM20702A1 based devices"
DESCRIPTION = "Firmware for broadcom BCM20702A1 based devices present in various sticks and \
laptops always over usb bridge."
LICENSE = "MIT"

PV = "1201650"

RPM_NAME = "bcm20702a1-firmware-1201650-9.4.noarch.rpm"
RPM_HASH = "d52c666941363c8b9ecf45423d43c7bf79fff54e332c8f923c78d6c72cec4317ec132949ae4bbcb723a909bb3af7f5cc884b919d2112dfdf2dbbcac9c34a0b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcm20702a1-firmware"

RDEPENDS:${PN} += "/bin/sh \
bluez \
coreutils \
unzip \
wget"

inherit rpm
