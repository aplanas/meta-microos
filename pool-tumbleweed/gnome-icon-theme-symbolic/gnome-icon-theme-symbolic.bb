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

RPM_NAME = "gnome-icon-theme-symbolic-3.12.0-3.18.noarch.rpm"
RPM_HASH = "fc3535940493318e146d83d4ae995cf020297a92c41f6a406baf18d1eadafc2e369d15a8c6b944a78534e19add94a89da2662962ee569e626d4f40ac4f6b525f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-icon-theme-symbolic \
pkgconfig(gnome-icon-theme-symbolic)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
gnome-icon-theme"

inherit rpm
