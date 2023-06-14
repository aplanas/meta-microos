SUMMARY = "Powerful fractal generator"
DESCRIPTION = "XaoS is a fast portable real-time interactive fractal zoomer. It \
displays the Mandelbrot set (among other escape time fractals) and \
allows you to zoom smoothly into the fractal.  Various coloring modes \
are provided for both the points inside and outside the selected set. \
In addition, switching between Julia and Mandelbrot fractal types and \
displaying planes is provided."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "xaos-4.2.1-1.11.aarch64.rpm"
RPM_HASH = "6a68fde21f86a4564d8ff3f3ba5c2dc7b6bbbdcb3bddbb2efde1a2a5d0dde05045ef3df6ab5b84ac54da173bbd33fa4e64fa6d0babe507de9b39577eaf37b180"

RPROVIDES:${PN} += "XaoS \
xaos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
