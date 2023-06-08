SUMMARY = "'Create New' templates for ODF files"
DESCRIPTION = "Templates for ODF files that show up in the 'Create New' context menu \
of KIO-based filemanagers (dolphin, konqueror, krusader, Plasma's folderview) \
and the KDE filedialog."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-filemanagertemplates-3.2.1-7.16.aarch64.rpm"
RPM_HASH = "ec185a2cf9b2d0f12a4ce2f852b1f02c10cc5365e5928132cea34eb42b0a91363f28ef8eb16e348f1c3c9fc3f00de675900fd39e2766c4aa18eb72dd3d8f7b54"

RPROVIDES:${PN} += "calligra-extras-filemanagertemplates calligra-extras-filemanagertemplates(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
