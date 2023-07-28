SUMMARY = "Fig import extensions for Inkscape"
DESCRIPTION = "Fig family (XFig, Figurine, JFig, WinFig,...) import extension for \
Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-fig-1.2.2-3.4.aarch64.rpm"
RPM_HASH = "e36806bad2f853f778efccd733c14e4ea0d02348b000d7faadce4b20fb476e8baadd4c1e8d26dcbecbb61eb8bec5b47ac2a3d63a962e50509c25106d1343149c"

RPROVIDES:${PN} += "inkscape-extensions-fig"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
transfig"

inherit rpm
