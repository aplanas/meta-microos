SUMMARY = "Development files for fcitx-qt5"
DESCRIPTION = "Development header files for Fcitx input method framework (Qt5)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt5-devel-1.2.7-1.27.aarch64.rpm"
RPM_HASH = "db7367b0ac6900b633fc6ee55dde51724ee4df3da78c9f2759291a7381821f1f25f64d755ddb99fed1b08175387402ec356ad0407f4ce2db126b7c1c952d0c93"

RPROVIDES:${PN} += "cmake-FcitxQt5DBusAddons \
cmake-FcitxQt5WidgetsAddons \
fcitx-qt5-devel"

RDEPENDS:${PN} += "fcitx-qt5"

inherit rpm
