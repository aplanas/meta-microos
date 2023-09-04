SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "imlib2-1.12.0-1.1.aarch64.rpm"
RPM_HASH = "9f66e0e21adb691b996f11e98eb9382508bdd293d60706f0ead31dda354fea197554e14304b928cb88be0bd773a212d958977b5080815d1106b1f92c01062ddd"

RPROVIDES:${PN} += "imlib2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
