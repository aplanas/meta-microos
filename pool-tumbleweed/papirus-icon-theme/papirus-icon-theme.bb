SUMMARY = "Papirus icon theme for Linux"
DESCRIPTION = "Papirus is an SVG icon theme, based on Paper with a few extras like \
hardcode-tray support, kde-color-scheme support, libreoffice icon theme, filezilla theme, smplayer themes ...) \
and other modifications. The theme is available for GTK and KDE. \
 \
This package contains the following icon themes: \
 \
ePapirus \
ePapirus-Dark \
Papirus \
Papirus-Dark \
Papirus-Light"
LICENSE = "GPL-3.0-only"

PV = "20230601"

RPM_NAME = "papirus-icon-theme-20230601-1.1.noarch.rpm"
RPM_HASH = "7c0accb6befbf05a683a08912992e266339625e961bf73bb35e18645c3199a2c89965afd2d1f241e88deb11211ca58fddf636bdd35353eef2ee943c743c791c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "papirus-icon-theme"

RDEPENDS:${PN} += "gtk3-tools"

inherit rpm
