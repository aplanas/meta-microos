SUMMARY = "Scientific plotting library for Python"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "python39-veusz-3.6.2-1.1.aarch64.rpm"
RPM_HASH = "561479afa0a65f89593e77b6af5d32d17fbfb07eeca0389ebf69cd3fe0e213f9a1e7a44d78673f539544463969d1efb3a544fdd7643ee99ff2d76da400dc74e8"

RPROVIDES:${PN} += "python3.9dist-veusz \
python39-veusz \
python3dist-veusz"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy \
python39-qt5 \
veusz-common"

inherit rpm
