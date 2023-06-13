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

RPROVIDES:${PN} += "python3.11dist(veusz) \
python311-veusz \
python311-veusz(aarch-64) \
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
python311-numpy \
python311-qt5 \
veusz-common"

inherit rpm
