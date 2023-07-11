SUMMARY = "KDE's window decorations library (development package)"
DESCRIPTION = "Development files belonging to kdecoration, \
plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libkdecoration2-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "573e845f8e0a43dfbdc7b120195fefcfed8e2f982311ca2ff2dcde51dbc5a0ae026023edced439c397247434658eb1e1fcc288a7e7b435a59a8942c3ee2f8da4"

RPROVIDES:${PN} += "cmake-KDecoration2 \
libkdecoration2-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
libkdecorations2-5 \
libkdecorations2private10"

inherit rpm
