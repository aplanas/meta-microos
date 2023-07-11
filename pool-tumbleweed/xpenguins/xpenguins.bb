SUMMARY = "Cute little penguins that walk along the tops of your windows"
DESCRIPTION = "This program animates a friendly family of penguins on your root \
window. They drop in from the top of the screen, walk along the tops of \
your windows, up the sides of your windows, up the side of the screen, \
and sometimes even levitate with their genetically-modified \
go-go-gadget 'copter ability."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "xpenguins-3.2.1-1.9.aarch64.rpm"
RPM_HASH = "699dc281bcd85dd6cc020e4bfd7cfe72a377e309c6dfda353df4b59401e516a6f8eaacae4ee8e45662f4e0125928352f747254a05ac500853b2453cd093bae2c"

RPROVIDES:${PN} += "xpenguins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
