SUMMARY = "Scientific plotting library for Python"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "python311-veusz-3.6.2-1.1.aarch64.rpm"
RPM_HASH = "efbb5abdcc613bf62b380a60c51476f3af406b11085f7b87a5a0cdadbb2a1cfab6c5d5accb1e2c328eb6e98a1729d2955277bff121aa9bea7f9edc0c97332a21"

RPROVIDES:${PN} += "python3.11dist-veusz \
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
