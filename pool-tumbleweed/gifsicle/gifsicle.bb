SUMMARY = "Creating and editing GIF images and animations"
DESCRIPTION = "Gifsicle manipulates GIF image files on the \
command line. It supports merging several GIFs \
into a GIF animation; exploding an animation into \
its component frames; changing individual frames \
in an animation; turning interlacing on and off; \
adding transparency; adding delays, disposals, and \
looping to animations; adding or removing \
comments; optimizing animations for space; and \
changing images' colormaps, among other things. \
 \
The gifsicle package contains two other programs: \
gifview, a lightweight GIF viewer for X, can show \
animations as slideshows or in real time, and \
gifdiff compares two GIFs for identical visual \
appearance."
LICENSE = "GPL-2.0-only"

PV = "1.93"

RPM_NAME = "gifsicle-1.93-1.8.aarch64.rpm"
RPM_HASH = "811bb5d781e24056b40bfdd389e4dee8a481d7ff8e7c0f7c8792c019dcec6ae7887fb4bb6a0e764ffe7de8048663ad3452b351aef723430e3cb141d7742a2e67"

RPROVIDES:${PN} += "gifsicle \
ungifsicle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
