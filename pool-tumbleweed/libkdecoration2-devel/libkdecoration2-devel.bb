SUMMARY = "KDE's window decorations library (development package)"
DESCRIPTION = "Development files belonging to kdecoration, \
plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libkdecoration2-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "dbd1c0d5a8c05fba6503ba3f8570a1b54facc81ea1fb7cd3763744dc6c829609b5bc35b6835693bfd7aad753b669722b17554019b9d8b6f1d8024aa7ae080e35"

RPROVIDES:${PN} += "cmake-KDecoration2 \
libkdecoration2-devel"

RDEPENDS:${PN} += "cmake-Qt5Gui \
libkdecorations2-5 \
libkdecorations2private10"

inherit rpm
