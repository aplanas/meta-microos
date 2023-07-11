SUMMARY = "A faithful remake of, and a tribute to, Atomix, a classic puzzle game"
DESCRIPTION = "Atomiks is a faithful remake of, and a tribute to, Atomix, a classic puzzle game \
created by Softtouch & RoSt and published in 1990 by the Thalion Software company. \
Atomiks is free software, and shares no code with the original Atomix game."
LICENSE = "GPL-3.0+"

PV = "1.0.4.1"

RPM_NAME = "atomiks-1.0.4.1-1.27.aarch64.rpm"
RPM_HASH = "fe91f799db22e169487404d4ba39838e72203c72191d3d829793ab9f13e6e352d8bb3290fa09d8eee44a731a1b596cccb927fd15292dcab438ebc39e8c6a83e5"

RPROVIDES:${PN} += "atomiks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6"

inherit rpm
