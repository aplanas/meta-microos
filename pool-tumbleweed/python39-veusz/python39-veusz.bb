SUMMARY = "Scientific plotting library for Python"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "python39-veusz-3.6.2-1.2.aarch64.rpm"
RPM_HASH = "2afa689e630e05fcfc9a53847ad5f7ba876d741461832ac9f955e997e4cb61d07f3fc29d8f9bc0ffc5d74484c407a8304172e3bca37c5492863670a105e4eb70"

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
