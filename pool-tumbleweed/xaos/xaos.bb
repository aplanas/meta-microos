SUMMARY = "Powerful fractal generator"
DESCRIPTION = "XaoS is a fast portable real-time interactive fractal zoomer. It \
displays the Mandelbrot set (among other escape time fractals) and \
allows you to zoom smoothly into the fractal.  Various coloring modes \
are provided for both the points inside and outside the selected set. \
In addition, switching between Julia and Mandelbrot fractal types and \
displaying planes is provided."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "xaos-4.2.1-1.12.aarch64.rpm"
RPM_HASH = "065e1c4c850f7d4bb8d100d0bf76b835fcb23e40d5dec35e714cc4f5301a0bc3b5d776bee0aa2e5d2f25cd41f6c1d6d4125e7f6129da21541d50c9f6147de81d"

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
