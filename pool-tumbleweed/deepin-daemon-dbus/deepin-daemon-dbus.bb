SUMMARY = "Deepin daemon DBus profiles"
DESCRIPTION = "This package provides dbus profiles for deepin-daemon. These profiles are not \
adopted by security team. If you need the dbus feature, you should install \
them manually or use deepin-dbus-install package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-dbus-5.14.45-2.4.noarch.rpm"
RPM_HASH = "b0d84176bcac18a3ba4a27a09b6a20da1a60e4170f6920480a26e47476f281e6a1824a769d3d3dfe7f6f3b445fefab82ad657b0ea64d7b5f6bdc16ec43b0ff63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-daemon-dbus"

RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
