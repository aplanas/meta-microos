SUMMARY = "Firmware for Technisat SkyStar USB HD"
DESCRIPTION = "This package provides the firmware images that should be automatically loaded \
as needed by the hotplug system."
LICENSE = "SUSE-Firmware"

PV = "17.63"

RPM_NAME = "technisat-usb2-firmware-17.63-7.7.noarch.rpm"
RPM_HASH = "cd61760e9ad7e6319a219321145aea6849eef3cc447ad1b938621a505d0dce25a678c183b3c4bb2889b4a596fa9c5a0c58e8eb0043cdca3291db2b1a29f8ff6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(dvb-usb-SkyStar_USB_HD_FW_v17_63.HEX.fw) \
technisat-usb2-firmware"
RDEPENDS:${PN} += ""

inherit rpm
