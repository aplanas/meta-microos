SUMMARY = "Development files for libavc1394, a library to the AV/C specification"
DESCRIPTION = "libavc1394 is a programming interface to the AV/C (Audio/Video \
Control) specification. Applications use the library to control the \
tape transport mechanism on DV camcorders. However, there are many \
devices and functions of devices that can be controlled via AV/C."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "libavc1394-devel-0.5.4-19.14.aarch64.rpm"
RPM_HASH = "15b5211bc4aede8b777a3fc4efe18cae7238aff72489c8a6053ed84716f1a76292519d0d81d9da113fec88488054e9da045e6ed2404fedaf07fca0cf5c6b67c2"

RPROVIDES:${PN} += "libavc1394-devel \
pkgconfig-libavc1394"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavc1394-0 \
pkgconfig-libraw1394"

inherit rpm
