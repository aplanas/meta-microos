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

PV = "1.94"

RPM_NAME = "gifsicle-1.94-1.1.aarch64.rpm"
RPM_HASH = "0279fc6a34d854a393bdd5392ca28cb902ba8ff56c8ac8148c36e223d5a1c37bf83360d35eabafb78a991218985e146325858cf18d465556f12f7c3b987092a2"

RPROVIDES:${PN} += "gifsicle \
ungifsicle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
