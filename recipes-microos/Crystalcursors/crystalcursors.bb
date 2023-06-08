SUMMARY = "Mouse Cursors in Crystal Icon Style"
DESCRIPTION = "Four different mouse cursor icon sets in the KDE CrystalSVG style. In \
white, gray, blue, and green versions. They can be selected from KDE \
Control Center, in the mouse configuration."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9"

RPM_NAME = "Crystalcursors-0.9-1.1.noarch.rpm"
RPM_HASH = "def63b92e8e55399256e1b425438924759bdd37c3e2436af341c35ff85516cdbd3ba349b0fe10371789be2ea6c7ca2ae39720a49792a83be55bcb5d8c3f6e0c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Crystalcursors"
RDEPENDS:${PN} += ""

inherit rpm
