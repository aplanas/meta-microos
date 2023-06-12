SUMMARY = "Icon theme inspired by Tango and Elementary"
DESCRIPTION = "This is an icon-theme maintained with Xfce in mind, \
but it supports other desktops like Gnome3 as well. \
It's a fork of the upstream elementary-project, \
which took place because the team decided to \
drop a lot of desktop-specific symlinks."
LICENSE = "GPL-2.0-only"

PV = "0.15.2+git0.2e2ca316"

RPM_NAME = "elementary-xfce-icon-theme-0.15.2+git0.2e2ca316-1.11.noarch.rpm"
RPM_HASH = "0bed57ffd051d87154308b374ca136ff34d0ba739bacd0b9ac518a2d54759e37a3807f35678b17bf2e9ba9b56a2ef538d9ed0c361acda595677ac0d0a30e71d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-xfce-icon-theme"
RDEPENDS:${PN} += "adwaita-icon-theme \
gtk3-tools \
hicolor-icon-theme"

inherit rpm
