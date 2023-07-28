SUMMARY = "'Create New' templates for ODF files"
DESCRIPTION = "Templates for ODF files that show up in the 'Create New' context menu \
of KIO-based filemanagers (dolphin, konqueror, krusader, Plasma's folderview) \
and the KDE filedialog."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-filemanagertemplates-3.2.1-7.20.aarch64.rpm"
RPM_HASH = "1459d265954df5b86a8dff6bb825e0958db2778adb234c143378fe8df81969f0fb6acd1e82182830696de0aa758915ce4d5a380cc6224eae6f578de741522122"

RPROVIDES:${PN} += "calligra-extras-filemanagertemplates"

RDEPENDS:${PN} += ""

inherit rpm
