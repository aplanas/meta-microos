SUMMARY = "Input Event Device Emulation Library"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "libevemu3-2.7.0-3.12.aarch64.rpm"
RPM_HASH = "71fb760d16657ebd6e46a2c3dd38da65704370f25cc2830be786d0fd43b6aaa0cdfd0e2b7628c0b1f8b79ea6889726e07ac18386c02271e5b2767ffbc26c0b50"

RPROVIDES:${PN} += "libevemu.so.3()(64bit) \
libevemu.so.3(EVEMU_2.0)(64bit) \
libevemu3 \
libevemu3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit)"

inherit rpm
