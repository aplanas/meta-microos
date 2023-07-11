SUMMARY = "Development files for libavc1394, a library to the AV/C specification"
DESCRIPTION = "libavc1394 is a programming interface to the AV/C (Audio/Video \
Control) specification. Applications use the library to control the \
tape transport mechanism on DV camcorders. However, there are many \
devices and functions of devices that can be controlled via AV/C."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "libavc1394-devel-0.5.4-19.15.aarch64.rpm"
RPM_HASH = "3c1984d4103d17831a0c2f2201e99ec6577e701c5ccc8daef7aabbf83ffa7690b91424e4bebcb3889a69d3b975912daeb9d78c14148d6dae2e102b59d7a8e6d5"

RPROVIDES:${PN} += "libavc1394-devel \
pkgconfig-libavc1394"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavc1394-0 \
pkgconfig-libraw1394"

inherit rpm
