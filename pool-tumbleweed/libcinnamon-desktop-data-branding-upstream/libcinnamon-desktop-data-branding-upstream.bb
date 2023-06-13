SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "libcinnamon-desktop-data-branding-upstream-5.8.0-1.1.noarch.rpm"
RPM_HASH = "c413fea4b25fff97509fa4d26f5c808a0e189ee3ce80411829f4b53a3bd1271049bba45f803f9e7c57779abbcfdeaa7883917c5b630f174fba039c7e4bf80653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcinnamon-desktop-data-branding \
libcinnamon-desktop-data-branding-upstream"

RDEPENDS:${PN} += "gnome-backgrounds \
libcinnamon-desktop-data \
metatheme-adwaita-common"

inherit rpm
