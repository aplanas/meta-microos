SUMMARY = "Input Event Device Emulation Library"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "evemu-2.7.0-3.13.aarch64.rpm"
RPM_HASH = "b7958b2f68d5806d2cae9e8fbbfa122ecd503d8f9e2f78105729b0819eac26a20c055d4c4df96d530e6dfd589c4772068f714660cbd4b1f3962e719c3504ed20"

RPROVIDES:${PN} += "evemu \
evemu-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libevemu.so.3"

inherit rpm
