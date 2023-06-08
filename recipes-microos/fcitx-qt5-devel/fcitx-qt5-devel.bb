SUMMARY = "Development files for fcitx-qt5"
DESCRIPTION = "Development header files for Fcitx input method framework (Qt5)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt5-devel-1.2.7-1.23.aarch64.rpm"
RPM_HASH = "e56b39c85340aee0c94a3dee8795d42ba34c499528a300a635b0c3af38b08794a2fa56d33b8f0415cf671fa7cf83459423d64777adce1835cb0aa3f5ad7622dd"

RPROVIDES:${PN} += "cmake(FcitxQt5DBusAddons) cmake(FcitxQt5WidgetsAddons) fcitx-qt5-devel fcitx-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "fcitx-qt5"

inherit rpm
