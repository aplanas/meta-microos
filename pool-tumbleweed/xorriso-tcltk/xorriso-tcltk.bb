SUMMARY = "Graphical frontend for xorriso"
DESCRIPTION = "xorriso is a program which maps file objects from POSIX compliant filesystems \
into Rock Ridge enhanced ISO 9660 filesystems and allows session-wise \
manipulation of such filesystems. It can load the management information of \
existing ISO images and it writes the session results to optical media or to \
filesystem objects. \
 \
This package provides a graphical frontend to xorriso."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "xorriso-tcltk-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "1dc2358e424412e6bd796395e6be62a0f0f4e69d6db5dcc3500e857fc17e0ed7b13e7ea57d7c88053d71ac859500069622b85a13b4c37f96691ce3d91a16ee13"

RPROVIDES:${PN} += "xorriso-tcltk"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/wish \
tcl \
tk \
xorriso"

inherit rpm
