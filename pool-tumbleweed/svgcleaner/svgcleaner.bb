SUMMARY = "A software to remove unnecessary data from SVG files"
DESCRIPTION = "Svgcleaner reduces the size of an SVG image by removing useless data such as \
- temporary data used by the vector editing application \
- non-optimal SVG structure representation \
- unused and invisible graphical elements"
LICENSE = "GPL-2.0-only"

PV = "0.9.5"

RPM_NAME = "svgcleaner-0.9.5-2.26.aarch64.rpm"
RPM_HASH = "7fc4bac735552442786239bbea71a06713317ac2ddaa63db5248c9fefa557ee323b2cf721f0c3a8b8b069004ba3378e93269278d52bd493b5c468874fc962772"

RPROVIDES:${PN} += "svgcleaner"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
p7zip \
svgcleaner-gui"

inherit rpm
