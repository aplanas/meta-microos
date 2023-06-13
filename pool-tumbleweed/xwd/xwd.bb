SUMMARY = "Utility to dump an image of an X window"
DESCRIPTION = "Xwd is an X Window System window dumping utility. It allows X users to \
store window images in a specially formatted dump file. This file can \
then be read by various other X utilities for redisplay, printing, \
editing, formatting, archiving, image processing, etc."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xwd-1.0.8-1.7.aarch64.rpm"
RPM_HASH = "93d927ea083b5e028faa2efa80139e57071efde101e37425ab87f83671ece93a4f75b5411bb95f048e3b780cc8c4a2c5fc96bbc29ef3fdf045d7503d232530c8"

RPROVIDES:${PN} += "xwd \
xwd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libxkbfile.so.1()(64bit)"

inherit rpm
