SUMMARY = "Fig import extensions for Inkscape"
DESCRIPTION = "Fig family (XFig, Figurine, JFig, WinFig,...) import extension for \
Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-fig-1.2.2-3.3.aarch64.rpm"
RPM_HASH = "2204027a1b57c5e1c69cc050bdcf83bdee52590824f91d1d145ed1f35885916f1fda0afd287cb202718d2724d6bb3e80cbc581920e768721cbdc25da0e2a1a2a"

RPROVIDES:${PN} += "inkscape-extensions-fig"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
transfig"

inherit rpm
