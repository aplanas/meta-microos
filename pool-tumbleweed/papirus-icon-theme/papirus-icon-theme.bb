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

PV = "20230301"

RPM_NAME = "papirus-icon-theme-20230301-1.1.noarch.rpm"
RPM_HASH = "d0885c0e7adefb139ac4077546a056855ffbd908d0fb4a522f8cc137340f5206aa160277704d17d55af404c22e4bcca9820237402d66ae30961c53da6bffbf54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "papirus-icon-theme"

RDEPENDS:${PN} += "gtk3-tools"

inherit rpm
