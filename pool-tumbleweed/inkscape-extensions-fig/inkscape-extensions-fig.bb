SUMMARY = "Fig import extensions for Inkscape"
DESCRIPTION = "Fig family (XFig, Figurine, JFig, WinFig,...) import extension for \
Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "inkscape-extensions-fig-1.3-1.1.aarch64.rpm"
RPM_HASH = "851b4d9ef4f3725f697912884bc2d19a73447d97d07ff822467dec8c7b6110cc16c05b3e5306084d9180a8226078d6773716b14a28c9c96f2488e32403b353c6"

RPROVIDES:${PN} += "inkscape-extensions-fig"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
transfig"

inherit rpm
