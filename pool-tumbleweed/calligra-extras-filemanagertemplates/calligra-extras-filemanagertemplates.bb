SUMMARY = "'Create New' templates for ODF files"
DESCRIPTION = "Templates for ODF files that show up in the 'Create New' context menu \
of KIO-based filemanagers (dolphin, konqueror, krusader, Plasma's folderview) \
and the KDE filedialog."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-filemanagertemplates-3.2.1-7.21.aarch64.rpm"
RPM_HASH = "f177540d608b57841e0b5c2c973392f0f246af649244f462b95576956b270e8efb859d4fcc014b67d4536e33e7ae0952e5054c84b5140c620dae9756bb1ede5c"

RPROVIDES:${PN} += "calligra-extras-filemanagertemplates"

RDEPENDS:${PN} += ""

inherit rpm
