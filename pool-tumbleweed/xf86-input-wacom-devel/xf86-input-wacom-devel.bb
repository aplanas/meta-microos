SUMMARY = "Development files for the Xorg X server Wacom input driver"
DESCRIPTION = "wacom is an X input driver and utilities for Wacom devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.40.0"

RPM_NAME = "xf86-input-wacom-devel-0.40.0-2.8.aarch64.rpm"
RPM_HASH = "ee6b5b63687c4190260cf173734234bae670cc52423192dd699018d14f1a92c147d5c9f7e838e5de54ac77fa3dee572872438ad37fc42326638c31a0f073ec4d"

RPROVIDES:${PN} += "pkgconfig-xorg-wacom \
x11-input-wacom-devel \
xf86-input-wacom-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
xf86-input-wacom"

inherit rpm
