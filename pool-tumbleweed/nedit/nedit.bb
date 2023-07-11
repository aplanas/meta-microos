SUMMARY = "A GUI text editor"
DESCRIPTION = "NEdit is a GUI style plain text editor for workstations with the X Window System \
and Motif. NEdit provides all of the standard menu, dialog, editing, \
mouse support, macro extension language, syntax highlighting, \
and a lot other nice features (and extensions for programmers)."
LICENSE = "GPL-2.0+"

PV = "5.7"

RPM_NAME = "nedit-5.7-2.27.aarch64.rpm"
RPM_HASH = "db1e6e85c44f39e7b1f2ae92fe91401f81b397708a13cce9d2eab31bfb483b6df8a35e2b5e24e702fd1113348c91ba1cbdcae78258acb4e3367b20daaef083ac"

RPROVIDES:${PN} += "nedit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
update-desktop-files"

inherit rpm
