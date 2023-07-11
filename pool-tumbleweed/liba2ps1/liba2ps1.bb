SUMMARY = "Library to convert ASCII/Latin text into PostScript"
DESCRIPTION = "The library liba2ps used by the program a2ps to convert ASCII text into PostScript."
LICENSE = "GPL-3.0-or-later"

PV = "4.15"

RPM_NAME = "liba2ps1-4.15-1.4.aarch64.rpm"
RPM_HASH = "f33e336066288df21a77d1ba681a7ba4e907bf1c1368266b0c1c538bd4665be94b798328b55980d818666824ecf4374acc7ae3f9076abeb916221c6e0af1be62"

RPROVIDES:${PN} += "liba2ps.so.1 \
liba2ps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
