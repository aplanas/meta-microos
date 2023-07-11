SUMMARY = "'Create New' templates for ODF files"
DESCRIPTION = "Templates for ODF files that show up in the 'Create New' context menu \
of KIO-based filemanagers (dolphin, konqueror, krusader, Plasma's folderview) \
and the KDE filedialog."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-filemanagertemplates-3.2.1-7.19.aarch64.rpm"
RPM_HASH = "395f9d17ecc6e5467efc7d4e18dfbfac46c56ad5abd04013f85efb7d18cd8912c759149d1c8c494fca2cced6e728c84ca92b49dbb51e94d0f15b5a3c2c0b2feb"

RPROVIDES:${PN} += "calligra-extras-filemanagertemplates"

RDEPENDS:${PN} += ""

inherit rpm
