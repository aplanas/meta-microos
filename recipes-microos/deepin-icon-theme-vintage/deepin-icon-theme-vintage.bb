SUMMARY = "Vintage icon theme for Deepin"
DESCRIPTION = "Vintage icons for the Deepin Desktop Environment."
LICENSE = "GPL-3.0-or-later"

PV = "2021.11.24"

RPM_NAME = "deepin-icon-theme-vintage-2021.11.24-3.8.noarch.rpm"
RPM_HASH = "622b10fac4daff84ec8d098fc3ff99afce336ad0df1070d68faa4c5013a5bae48cd21ff80d118035e543dbb193e678ffeb1f629cf2a0b96c3d81cdab46567f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-icon-theme-vintage"
RDEPENDS:${PN} += ""

inherit rpm
