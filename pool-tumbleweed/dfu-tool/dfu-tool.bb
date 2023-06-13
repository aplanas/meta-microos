SUMMARY = "Generic tool Device Firmware Upgrade (DFU) tool"
DESCRIPTION = "A generic tool to upload firmware to USB Devices based on Device Firmware Upgrade (DFU)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "dfu-tool-1.8.12-1.3.aarch64.rpm"
RPM_HASH = "d4de51d7419a9165735947b5997c439872d26fb0b360a1c507051fdd96f1470dda09197a34a56d0857bffc306aa3c03bf1d5e2e0a7752468ea74b2ecf59b16e7"

RPROVIDES:${PN} += "dfu-tool \
dfu-tool(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfwupd.so.2()(64bit) \
libfwupd.so.2(LIBFWUPD_0.1.1)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.3)(64bit) \
libfwupd.so.2(LIBFWUPD_1.1.2)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.8)(64bit) \
libfwupdplugin.so()(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_0.1.0)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_0.7.1)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.0)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.2)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.0.8)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.1.2)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.3.1)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.3.3)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.4.1)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.5)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.5.6)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.6.0)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.6.2)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.0)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.1)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.7.7)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.11)(64bit) \
libfwupdplugin.so(LIBFWUPDPLUGIN_1.8.2)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgusb.so.2()(64bit) \
libgusb.so.2(LIBGUSB_0.1.0)(64bit) \
libgusb.so.2(LIBGUSB_0.2.2)(64bit) \
libgusb.so.2(LIBGUSB_0.2.8)(64bit) \
libgusb.so.2(LIBGUSB_0.2.9)(64bit) \
libgusb.so.2(LIBGUSB_0.3.6)(64bit)"

inherit rpm
