SUMMARY = "Linux 'VBI proxy'"
DESCRIPTION = "With 'video4linux' drivers, only one application at a time can capture \
VB data.  The 2nd generation 'v4l2' API allows multiple clients to \
open a device, but still only one client may read from the device.  If, \
for example, the Nxtvepg daemon runs in the background, users will not be \
able to start a Teletext application.  The VBI proxy was developed as a \
solution to this problem."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.41"

RPM_NAME = "zvbi-0.2.41-2.2.aarch64.rpm"
RPM_HASH = "aec71a187e098c8e32b3efa5a4cd401c76d55b0f0858c9f3a885b412ef5b1edb1608e4fc528ff3bc7478f852cf8a34284b4bf3c6456e26723f241cc049d319d3"

RPROVIDES:${PN} += "zvbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libzvbi.so.0"

inherit rpm
