SUMMARY = "Linux 'VBI proxy'"
DESCRIPTION = "With 'video4linux' drivers, only one application at a time can capture \
VB data.  The 2nd generation 'v4l2' API allows multiple clients to \
open a device, but still only one client may read from the device.  If, \
for example, the Nxtvepg daemon runs in the background, users will not be \
able to start a Teletext application.  The VBI proxy was developed as a \
solution to this problem."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.42"

RPM_NAME = "zvbi-0.2.42-1.1.aarch64.rpm"
RPM_HASH = "abae3f0176a38e61b8910be9c689978068c03e14c2bd4591b950afd8b5e913970f5109486beb38f94e6ab149189860c45dfee7f0f72ca6f65fd73c39b818ab0a"

RPROVIDES:${PN} += "zvbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libzvbi.so.0"

inherit rpm
