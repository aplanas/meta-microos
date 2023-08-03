SUMMARY = "Generic tool Device Firmware Upgrade (DFU) tool"
DESCRIPTION = "A generic tool to upload firmware to USB Devices based on Device Firmware Upgrade (DFU)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "dfu-tool-1.8.17-1.1.aarch64.rpm"
RPM_HASH = "4d147f5e53f55093aebbe8410d3fdf542fe63f6575aff7cc77fb059a4c962fb860e703e623606800d0d398e2621ded042780dca257c2d85d1e5bdf26d15ea5c5"

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
