SUMMARY = "Faenza-Radiance Icon Theme"
DESCRIPTION = "This icon theme for GNOME provides monochromatic icons for panels, \
toolbars and buttons and colourful squared icons for devices, \
applications, folder, files and GNOME menu items. \
 \
Faenza-Radiance is suitable with light panel and controls."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "faenza-icon-theme-radiance-1.3.1-1.4.noarch.rpm"
RPM_HASH = "345890cd2433bdccb439cccb42ecf08c2b6e1e274ce0e841ecf3d4aee4d869d1d2be74e9210e98af3288362cb67af5f2ee23f436632baec6bc71d2fc67f5e300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faenza-icon-theme-radiance"
RDEPENDS:${PN} += "/bin/sh \
faenza-icon-theme"

inherit rpm
