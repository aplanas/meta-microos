SUMMARY = "Development files for evemu"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices. \
 \
This package provides the development files."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "evemu-devel-2.7.0-3.12.aarch64.rpm"
RPM_HASH = "df465e7018e4ff7d90cfd97deaeee99847a946fbdba3f98cf15125ed91ce2089afe1ed5bf49fb6c7e74004e09baa1485b080e8557b6a7d94d4043f871ecdac95"

RPROVIDES:${PN} += "evemu-devel \
pkgconfig-evemu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
evemu \
libevemu3 \
pkgconfig-libevdev"

inherit rpm
