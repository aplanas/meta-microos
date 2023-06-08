SUMMARY = "Various themes for Emerald decorator"
DESCRIPTION = "Various themes to be used with Emerald decorator of Compiz \
window/compositing manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-themes-0.8.18-1.10.noarch.rpm"
RPM_HASH = "e505848b4c8216cfa4281d6d1d1df0602c6327240ee95d2ea585a280911af9e406d20db687e7a5fe2423c4d3e3f9cbf59258187ac9e1c738955a52d96788d619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-emerald-themes"
RDEPENDS:${PN} += "compiz-emerald"

inherit rpm
