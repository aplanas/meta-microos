SUMMARY = "Symbolic icon theme for GNOME"
DESCRIPTION = "The purpose of this icon theme is to extend the base icon theme that \
follows the Tango style guidelines for specific purposes. This would \
include OSD messages, panel system/notification area, and possibly \
menu icons. \
 \
Icons follow the naming specification, but have a -symbolic suffix, so \
only applications specifically looking up these symbolic icons will \
render them. If a -symbolic icon is missing, the app will fall back to \
the regular name."
LICENSE = "CC-BY-SA-3.0"

PV = "3.12.0"

RPM_NAME = "gnome-icon-theme-symbolic-3.12.0-3.19.noarch.rpm"
RPM_HASH = "4ab47ceabda40df5415dfd147fe4ade519372d2e5ba1817d413f8680787a18de5b765c21b457232e5bdd42b5ff7fbd1e34a5a71dd6c444ee7e8ab2e35d75ed8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-icon-theme-symbolic \
pkgconfig-gnome-icon-theme-symbolic"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gnome-icon-theme"

inherit rpm
