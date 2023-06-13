SUMMARY = "'Create New' templates for ODF files"
DESCRIPTION = "Templates for ODF files that show up in the 'Create New' context menu \
of KIO-based filemanagers (dolphin, konqueror, krusader, Plasma's folderview) \
and the KDE filedialog."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-filemanagertemplates-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "6b9bd3652ab192710106bcafbff13a98907e5e8077bb9dc2a1d0c105428b12be9e5f684e1a7eef49e8fdb915a6a00d1554dc0abe3dd2c625c5efdb4eba3eea73"

RPROVIDES:${PN} += "calligra-extras-filemanagertemplates \
calligra-extras-filemanagertemplates(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
