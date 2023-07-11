SUMMARY = "Caja GSchemas"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems. \
 \
This package provides the GSettings schemas for Caja."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-gschemas-1.26.1-1.5.aarch64.rpm"
RPM_HASH = "218c058b458fae8b1fdc09792561b10983097cbf44779330299cfa38492afe1105cd1215115bc95251cef87fd0c54ec3714fbad90ecd0f533fc4eeab98a64ecd"

RPROVIDES:${PN} += "caja-gschemas \
caja-gsettings-schemas"

RDEPENDS:${PN} += ""

inherit rpm
