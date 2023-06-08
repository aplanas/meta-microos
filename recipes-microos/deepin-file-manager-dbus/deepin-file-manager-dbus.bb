SUMMARY = "Deepin File DBus profiles"
DESCRIPTION = "This package provides dbus profiles for deepin-file-manager. These profiles are \
not adopted by security team. If you need the dbus feature, you should install \
them manually or use deepin-dbus-install package."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-dbus-5.6.4-3.7.noarch.rpm"
RPM_HASH = "87a963cfd6a9e55ff129464960ab3abdd324485156ec545f7ed4018c43ffae5e7aebe37120c3b38e7954e9f11b67a3fefa56ab8a386d8ddd62bb412671b54bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-file-manager-dbus"
RDEPENDS:${PN} += "deepin-file-manager"

inherit rpm
