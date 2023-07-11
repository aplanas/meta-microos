SUMMARY = "Scientific plotting library for Python"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "python311-veusz-3.6.2-1.2.aarch64.rpm"
RPM_HASH = "ecc36313b1d49a62dc6ae89873e40707ea323e02f93950ca78ee258a333c826904647141793380e97b0f482c5ca751cdd185dfa3d96706c098ac1e25df48ad5d"

RPROVIDES:${PN} += "python3-veusz \
python3.11dist-veusz \
python311-veusz \
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
python311-numpy \
python311-qt5 \
veusz-common"

inherit rpm
