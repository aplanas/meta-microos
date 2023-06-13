SUMMARY = "Scientific plotting library for Python"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "python310-veusz-3.6.2-1.1.aarch64.rpm"
RPM_HASH = "c2fe198971d779f04b1d8f07ddc8d91e8e07e452e0ccc15d796956b50657e688c541e65f3487a53b51fb3c53b3bc42c1e6fa32fc9f807909f11793916964b8ad"

RPROVIDES:${PN} += "python3-veusz \
python3.10dist(veusz) \
python310-veusz \
python310-veusz(aarch-64) \
python3dist(veusz)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-numpy \
python310-qt5 \
veusz-common"

inherit rpm
