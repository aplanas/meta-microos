SUMMARY = "Input Event Device Emulation Library"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "evemu-2.7.0-3.12.aarch64.rpm"
RPM_HASH = "5834ecd70961105e0cbc74ab7946ac53659a02a9350e5163d642c387a16499a14e3e16886ad6b5d0ded2a6b158fedc5dbaa261c39f112bfda5d6c6209e76cbed"

RPROVIDES:${PN} += "evemu evemu(aarch-64) evemu-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libevdev.so.2()(64bit) libevdev.so.2(LIBEVDEV_1)(64bit) libevemu.so.3()(64bit) libevemu.so.3(EVEMU_2.0)(64bit)"

inherit rpm
