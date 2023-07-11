SUMMARY = "Graphical frontend for xorriso"
DESCRIPTION = "xorriso is a program which maps file objects from POSIX compliant filesystems \
into Rock Ridge enhanced ISO 9660 filesystems and allows session-wise \
manipulation of such filesystems. It can load the management information of \
existing ISO images and it writes the session results to optical media or to \
filesystem objects. \
 \
This package provides a graphical frontend to xorriso."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "xorriso-tcltk-1.5.4-1.11.aarch64.rpm"
RPM_HASH = "2356e04be700ab5f3abc76d69a0c4088a7b6b52d347259d0ce6b192e815fad608cdac6cd02f71f4f2650e32a8fcd8082a1d060642d7d7cf1d821c62c6399a82f"

RPROVIDES:${PN} += "xorriso-tcltk"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/wish \
tcl \
tk \
xorriso"

inherit rpm
