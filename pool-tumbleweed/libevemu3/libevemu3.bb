SUMMARY = "Input Event Device Emulation Library"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "libevemu3-2.7.0-3.13.aarch64.rpm"
RPM_HASH = "fe090f9d5f24f5e8243178a892f2a6c763e7fbc64b10fbcd7c7872f243cd6465e970a4a4f601eb6fcb224a2a67bc18444ebf809b8bb2518dfc3df0bb7c06242d"

RPROVIDES:${PN} += "libevemu.so.3 \
libevemu3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2"

inherit rpm
