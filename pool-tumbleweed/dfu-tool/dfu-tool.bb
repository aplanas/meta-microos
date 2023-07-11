SUMMARY = "Generic tool Device Firmware Upgrade (DFU) tool"
DESCRIPTION = "A generic tool to upload firmware to USB Devices based on Device Firmware Upgrade (DFU)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.16"

RPM_NAME = "dfu-tool-1.8.16-2.1.aarch64.rpm"
RPM_HASH = "17621b6bc83f53b9c971b048799d5bbfba0af40e57a8075d837c6acceb3d94b96deb6b87afbc31ad4bf87dffe290c72cc7c7ce5dfb9d742d096ed524fd5726ae"

RPROVIDES:${PN} += "dfu-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfwupd.so.2 \
libfwupdplugin.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgusb.so.2"

inherit rpm
