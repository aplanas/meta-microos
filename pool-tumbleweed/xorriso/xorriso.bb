SUMMARY = "ISO 9660 Rock Ridge Filesystem Manipulator"
DESCRIPTION = "xorriso is a program which maps file objects from POSIX compliant filesystems \
into Rock Ridge enhanced ISO 9660 filesystems and allows session-wise \
manipulation of such filesystems. It can load the management information of \
existing ISO images and it writes the session results to optical media or to \
filesystem objects. \
Vice versa xorriso is able to restore file objects from ISO 9660 filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "xorriso-1.5.4-1.11.aarch64.rpm"
RPM_HASH = "9e3a25f7c4e2bd9008073b5e639d64fb43337f9bcd04464b916be8d5f8340e6d511578c20910d6a573257b74458a22234123e66023484522093d15d81528ddcc"

RPROVIDES:${PN} += "libburnia-tools \
libburnia-tools-x11 \
xorriso"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libisoburn.so.1"

inherit rpm
