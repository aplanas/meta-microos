SUMMARY = "Development files for fcitx-qt5"
DESCRIPTION = "Development header files for Fcitx input method framework (Qt5)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt5-devel-1.2.7-1.25.aarch64.rpm"
RPM_HASH = "99530b100307b6bfdc7c745aa0dbc0fd4ff618f06ca5cca8a9c9b594f22f3d4b3e4d49e8ead9bace44412cccee02f1e48881cbd2034a8cafae929d6aa54a0260"

RPROVIDES:${PN} += "cmake(FcitxQt5DBusAddons) \
cmake(FcitxQt5WidgetsAddons) \
fcitx-qt5-devel \
fcitx-qt5-devel(aarch-64)"

RDEPENDS:${PN} += "fcitx-qt5"

inherit rpm
