SUMMARY = "Utility to dump an image of an X window"
DESCRIPTION = "Xwd is an X Window System window dumping utility. It allows X users to \
store window images in a specially formatted dump file. This file can \
then be read by various other X utilities for redisplay, printing, \
editing, formatting, archiving, image processing, etc."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "xwd-1.0.9-1.1.aarch64.rpm"
RPM_HASH = "a3a81cb110a97d0b0d5821ba0360fe8a53e00b9b576526061daf9e45e0fc90fc773e16826d7a9a3e2d190197a9ed215f5168a7bcb5643c04bd6c9e4942d76b7d"

RPROVIDES:${PN} += "xwd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
