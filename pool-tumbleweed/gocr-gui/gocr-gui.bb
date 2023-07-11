SUMMARY = "Optical Character Recognition Program - Basic Graphical Interface"
DESCRIPTION = "GOCR is an optical character recognition program. It reads images in \
many formats and outputs a text file. It is also able to recognize \
and translate barcodes. \
 \
This package contains a basic graphical interface for GOCR."
LICENSE = "GPL-2.0-or-later"

PV = "0.52"

RPM_NAME = "gocr-gui-0.52-3.3.noarch.rpm"
RPM_HASH = "9fc666fee81d8137e9fad114708aef984cd061a0f7ee680de2d41bed2469c5640883d6482714ef023b94211a85b510223b272b2278c3d236e883c247f641cecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gocr-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
gocr \
tk"

inherit rpm
