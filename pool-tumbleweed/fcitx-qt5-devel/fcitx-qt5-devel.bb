SUMMARY = "Development files for fcitx-qt5"
DESCRIPTION = "Development header files for Fcitx input method framework (Qt5)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt5-devel-1.2.7-1.26.aarch64.rpm"
RPM_HASH = "def8fbf12d258578ffeae2acd2adf81777647c8c04d6e322bd0bfbf8d5a9e3ee5aa3f5679ce59ad07aaf37777c857546fe29217bc0bf444e6f49a4cd26a40763"

RPROVIDES:${PN} += "cmake-FcitxQt5DBusAddons \
cmake-FcitxQt5WidgetsAddons \
fcitx-qt5-devel"

RDEPENDS:${PN} += "fcitx-qt5"

inherit rpm
