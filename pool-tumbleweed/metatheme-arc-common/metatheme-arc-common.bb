SUMMARY = "Arc Common Theme Files"
DESCRIPTION = "Arc is a flat theme with transparent elements. \
It supports MATE, GNOME, Budgie, Xfce, and Cinnamon. \
 \
This package contains common files and themes for GNOME Shell, \
Marco, Xfwm4, and Cinnamon."
LICENSE = "GPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "metatheme-arc-common-20221218-1.1.noarch.rpm"
RPM_HASH = "5342a86a707893add81d3d2aa722267f8237020c5f70e72beef02b21e6ca4b11359723d11cb28fe67c9b710f6bf847d9882b200184375c719d87142497a635e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-arc-common"

RDEPENDS:${PN} += ""

inherit rpm
