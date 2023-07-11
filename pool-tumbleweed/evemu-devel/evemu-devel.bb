SUMMARY = "Development files for evemu"
DESCRIPTION = "The evemu library and tools are used to describe devices, record \
data, create emulation devices and replay data from kernel evdev \
(input event) devices. \
 \
This package provides the development files."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "evemu-devel-2.7.0-3.13.aarch64.rpm"
RPM_HASH = "c593803140c10b9efc9d8c4a6156c2f68cf583d51ec022b339a389df7b8224c66412f551b2e43c32b4dde3ea7c4b358ecfad476fb714b1da10ea7ef17a9cb673"

RPROVIDES:${PN} += "evemu-devel \
pkgconfig-evemu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
evemu \
libevemu3 \
pkgconfig-libevdev"

inherit rpm
