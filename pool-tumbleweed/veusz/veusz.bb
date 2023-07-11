SUMMARY = "GUI scientific plotting package"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. It features GUI, \
command-line, and scripting interfaces. Graphs are constructed from \
widgets, allowing complex layouts to be designed. Veusz supports \
plotting functions, data with errors, keys, labels, stacked plots, \
multiple plots, contours, shapes and fitting data."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "veusz-3.6.2-1.2.noarch.rpm"
RPM_HASH = "0eb5f374b041f0208728e445ba4e8debfe0d1462592b335fd6fea216f40c5bea77f660867bc4d06c14c42816cb943a03606600d011cd4e9c21ffe07799e61a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "veusz \
veusz3"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
desktop-file-utils \
python3-veusz \
shared-mime-info \
veusz-common"

inherit rpm
