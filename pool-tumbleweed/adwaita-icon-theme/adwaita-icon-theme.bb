SUMMARY = "GNOME Icon Theme"
DESCRIPTION = "The default GNOME icon theme, Adwaita."
LICENSE = "CC-BY-SA-3.0 | LGPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "adwaita-icon-theme-44.0-1.1.noarch.rpm"
RPM_HASH = "30afcaf111b76409165e48c1bafbbb0ca8dc5a9af85297a74df2a27f7127f92c96da3f7608ede25b11b6bd1f2743ce4a30d81c5df6db4e643410957a7fcd4666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adwaita-icon-theme \
adwaita-icon-theme-devel \
pkgconfig-adwaita-icon-theme"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
