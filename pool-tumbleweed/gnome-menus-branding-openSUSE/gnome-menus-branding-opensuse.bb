SUMMARY = "The GNOME Desktop Menu -- openSUSE Menus Definitions"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec \
 \
This package provides the openSUSE definitions for menus."
LICENSE = "LGPL-2.1-or-later"

PV = "42.1"

RPM_NAME = "gnome-menus-branding-openSUSE-42.1-1.10.noarch.rpm"
RPM_HASH = "1433a94c327f7850ab64c4854d2d42a22b22b8ab03955df73de86a5b7b9c50e5c70e8f25586bab32e91d93897867feb3d8ed8b1feda9f49f5a99add69221af92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-menus-branding \
gnome-menus-branding-openSUSE"

RDEPENDS:${PN} += "gnome-menus"

inherit rpm
