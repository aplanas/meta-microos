SUMMARY = "Fig import extensions for Inkscape"
DESCRIPTION = "Fig family (XFig, Figurine, JFig, WinFig,...) import extension for \
Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-fig-1.2.2-3.5.aarch64.rpm"
RPM_HASH = "ad28b212c55e26659ba5897196a6e3aac8ce53ae6d3d05c50330668834a3c88fdb6d40f1b45749a0bf51bd54be28e3019281ac24ac981405a87584f8c9db6a1b"

RPROVIDES:${PN} += "inkscape-extensions-fig"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
transfig"

inherit rpm
