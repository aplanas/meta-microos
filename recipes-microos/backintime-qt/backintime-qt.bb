SUMMARY = "Back In Time Qt5 GUI"
DESCRIPTION = "This package has a Qt5 GUI for backintime."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "backintime-qt-1.3.3-2.1.noarch.rpm"
RPM_HASH = "ff63243e847928fdad4ef630560ad82b861ecc04ec941c84a618932040052d795f6062f5a628ffd4a72dfab6055cdeb6408bb1582d66692bb6ce145060d6c0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(backintime-qt-root.desktop) application(backintime-qt.desktop) backintime-qt config(backintime-qt)"
RDEPENDS:${PN} += "/bin/sh backintime dbus-1-python3 polkit python3-qt5"

inherit rpm
