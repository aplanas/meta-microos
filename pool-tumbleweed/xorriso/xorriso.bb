SUMMARY = "ISO 9660 Rock Ridge Filesystem Manipulator"
DESCRIPTION = "xorriso is a program which maps file objects from POSIX compliant filesystems \
into Rock Ridge enhanced ISO 9660 filesystems and allows session-wise \
manipulation of such filesystems. It can load the management information of \
existing ISO images and it writes the session results to optical media or to \
filesystem objects. \
Vice versa xorriso is able to restore file objects from ISO 9660 filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "xorriso-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "947e5be1ec0028a53bc216f0797a45055ccc3311808099cb4ceeae5fffd83b452cb562b0ebd0e779715fcd5d87838910967a80ffb0aa77227b81f97fd8e75b7a"

RPROVIDES:${PN} += "libburnia-tools \
libburnia-tools-x11 \
xorriso"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libisoburn.so.1"

inherit rpm
