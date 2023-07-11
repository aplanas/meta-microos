SUMMARY = "Scientific plotting library for Python"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "python310-veusz-3.6.2-1.2.aarch64.rpm"
RPM_HASH = "e6ebacd6bd61701c483b7f02ef70e038962d92f5efcf1942f2ea90fe1b2eb993d45c009341a19bdc8b2721872c9eab1dbb447e94a6eee8b46b0f73196f6e1288"

RPROVIDES:${PN} += "python3.10dist-veusz \
python310-veusz \
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
python310-numpy \
python310-qt5 \
veusz-common"

inherit rpm
