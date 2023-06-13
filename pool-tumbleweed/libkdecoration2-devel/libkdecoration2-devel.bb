SUMMARY = "KDE's window decorations library (development package)"
DESCRIPTION = "Development files belonging to kdecoration, \
plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libkdecoration2-devel-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "e09b4dacbdafd3d058914dacc61fd95f87bea646d06bd1975a43180cfe9c9894ed22d406265abac993ae7af7e7119b8e9a6c55359ec08fd849f6d7f28730fb53"

RPROVIDES:${PN} += "cmake(KDecoration2) \
libkdecoration2-devel \
libkdecoration2-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Gui) \
libkdecorations2-5 \
libkdecorations2private10"

inherit rpm
