SUMMARY = "'Create New' templates for ODF files"
DESCRIPTION = "Templates for ODF files that show up in the 'Create New' context menu \
of KIO-based filemanagers (dolphin, konqueror, krusader, Plasma's folderview) \
and the KDE filedialog."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-filemanagertemplates-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "eae3f6cc71f87c75bf8fc0a3449d545f02973cc5c4c6023777e4c6a2d8e708e49c81dbd67dc03ff9e775f5ac76141f739c768b35b22b5a93e359a7cbc95073e3"

RPROVIDES:${PN} += "calligra-extras-filemanagertemplates"

RDEPENDS:${PN} += ""

inherit rpm
