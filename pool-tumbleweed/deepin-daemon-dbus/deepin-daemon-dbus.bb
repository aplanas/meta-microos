SUMMARY = "Deepin daemon DBus profiles"
DESCRIPTION = "This package provides dbus profiles for deepin-daemon. These profiles are not \
adopted by security team. If you need the dbus feature, you should install \
them manually or use deepin-dbus-install package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-dbus-5.14.45-2.5.noarch.rpm"
RPM_HASH = "4ebdc2010f5f102dc269b840f3a810bdc99b12f97e13c083a0ab97ce4f6f7917d578946dcd030285f74001cc3fe39f5bb7979872ebc302f1e02342faa7af824b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-daemon-dbus"

RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
