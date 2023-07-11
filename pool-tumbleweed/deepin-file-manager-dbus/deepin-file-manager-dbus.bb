SUMMARY = "Deepin File DBus profiles"
DESCRIPTION = "This package provides dbus profiles for deepin-file-manager. These profiles are \
not adopted by security team. If you need the dbus feature, you should install \
them manually or use deepin-dbus-install package."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-dbus-5.6.4-3.9.noarch.rpm"
RPM_HASH = "b4eae3c8c8c5609cb431caaae92f5b8ee0e4b43cef22623b7dfda2424eb5725493444597e102cdd8c69ef7d89d2e40fff3eeb2b4ffd372d36136e8d4250c31de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-file-manager-dbus"

RDEPENDS:${PN} += "deepin-file-manager"

inherit rpm
